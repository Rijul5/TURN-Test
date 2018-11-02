"use strict";
/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
var __assign = (this && this.__assign) || Object.assign || function(t) {
    for (var s, i = 1, n = arguments.length; i < n; i++) {
        s = arguments[i];
        for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
            t[p] = s[p];
    }
    return t;
};
Object.defineProperty(exports, "__esModule", { value: true });
var inversify_1 = require("inversify");
var core_1 = require("@theia/core");
var browser_1 = require("@theia/languages/lib/browser");
var turn_language_client_contribution_1 = require("./turn-language-client-contribution");
var lib_1 = require("../../../../theia-sprotty/lib");
var di_config_1 = require("../turndiagram/di.config");
var lib_2 = require("../../../../theia-sprotty/lib");
var turn_diagram_manager_1 = require("../turndiagram/turn-diagram-manager");
var browser_2 = require("@theia/core/lib/browser");
var browser_3 = require("@theia/core/lib/browser");
var browser_4 = require("@theia/core/lib/browser");
var turn_monaco_language_1 = require("./turn-monaco-language");
var turn_commands_1 = require("./turn-commands");
var monaco_editor_provider_1 = require("@theia/monaco/lib/browser/monaco-editor-provider");
var turn_monaco_editor_provider_1 = require("../monaco/turn-monaco-editor-provider");
require("sprotty/css/sprotty.css");
require("theia-sprotty/css/theia-sprotty.css");
var dynamic_commands_1 = require("./dynamic-commands");
var theme_manager_1 = require("../turndiagram/theme-manager");
var outline_view_widget_1 = require("@theia/outline-view/lib/browser/outline-view-widget");
exports.FILE_NAVIGATOR_PROPS = __assign({}, browser_3.defaultTreeProps, { contextMenuPath: turn_language_client_contribution_1.OUTLINE_CONTEXT_MENU, multiSelect: true });
exports.default = new inversify_1.ContainerModule(function (bind, unbind, isBound, rebind) {
    monaco.languages.register({
        id: 'turn',
        aliases: ['Turn', 'turn'],
        extensions: ['.turn'],
        mimetypes: ['text/turn']
    });
    monaco.languages.onLanguage('turn', function () {
        monaco.languages.setLanguageConfiguration('turn', turn_monaco_language_1.configuration);
        monaco.languages.setMonarchTokensProvider('turn', turn_monaco_language_1.monarchLanguage);
    });
    bind(core_1.CommandContribution).to(turn_commands_1.TURNCommandContribution).inSingletonScope();
    bind(turn_language_client_contribution_1.TurnLanguageClientContribution).toSelf().inSingletonScope();
    bind(core_1.CommandContribution).to(turn_language_client_contribution_1.DiagramCommandContribution);
    bind(core_1.MenuContribution).to(turn_language_client_contribution_1.DiagramMenuContribution);
    bind(browser_1.LanguageClientContribution).toDynamicValue(function (ctx) { return ctx.container.get(turn_language_client_contribution_1.TurnLanguageClientContribution); });
    bind(lib_1.DiagramConfiguration).to(di_config_1.TURNDiagramConfiguration).inSingletonScope();
    bind(lib_2.DiagramManagerProvider).toProvider(function (context) {
        return function () {
            return new Promise(function (resolve) {
                return resolve(context.container.get(turn_diagram_manager_1.TURNDiagramManager));
            });
        };
    }).whenTargetNamed('turn-diagram');
    bind(turn_diagram_manager_1.TURNDiagramManager).toSelf().inSingletonScope();
    bind(browser_2.FrontendApplicationContribution).toDynamicValue(function (context) { return context.container.get(turn_diagram_manager_1.TURNDiagramManager); });
    bind(browser_2.OpenHandler).toDynamicValue(function (context) { return context.container.get(turn_diagram_manager_1.TURNDiagramManager); });
    bind(dynamic_commands_1.ContextMenuCommands).to(dynamic_commands_1.ContextMenuCommands).inSingletonScope();
    rebind(monaco_editor_provider_1.MonacoEditorProvider).to(turn_monaco_editor_provider_1.TURNMonacoEditorProvider).inSingletonScope();
    rebind(outline_view_widget_1.OutlineViewWidgetFactory).toFactory(function (ctx) {
        return function () { return createOutlineViewWidgetWithContextMenu(ctx.container); };
    });
    bind(theme_manager_1.ThemeManager).toSelf().inSingletonScope();
});
function createOutlineViewWidgetWithContextMenu(parent) {
    var child = browser_2.createTreeContainer(parent);
    child.unbind(browser_3.TreeWidget);
    child.bind(outline_view_widget_1.OutlineViewWidget).toSelf();
    child.rebind(browser_4.TreeProps).toConstantValue(exports.FILE_NAVIGATOR_PROPS);
    return child.get(outline_view_widget_1.OutlineViewWidget);
}
//# sourceMappingURL=frontend-extension.js.map