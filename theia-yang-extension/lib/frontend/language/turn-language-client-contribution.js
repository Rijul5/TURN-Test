"use strict";
/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = y[op[0] & 2 ? "return" : op[0] ? "throw" : "next"]) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [0, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
var inversify_1 = require("inversify");
var browser_1 = require("@theia/core/lib/browser");
var browser_2 = require("@theia/core/lib/browser");
var browser_3 = require("@theia/languages/lib/browser");
var lib_1 = require("theia-sprotty/lib");
var common_1 = require("@theia/core/lib/common");
var dynamic_commands_1 = require("./dynamic-commands");
var common_2 = require("@theia/core/lib/common");
var browser_4 = require("@theia/editor/lib/browser");
var monaco_outline_contribution_1 = require("@theia/monaco/lib/browser/monaco-outline-contribution");
exports.OUTLINE_CONTEXT_MENU = ['outline-context-menu'];
var OutlineContextMenu;
(function (OutlineContextMenu) {
    OutlineContextMenu.OPEN = exports.OUTLINE_CONTEXT_MENU.concat(['1_open']);
    OutlineContextMenu.OPEN_WITH = OutlineContextMenu.OPEN.concat(['open_with']);
})(OutlineContextMenu = exports.OutlineContextMenu || (exports.OutlineContextMenu = {}));
exports.TURNDiagramCommand = {
    id: 'TURNDiagram.command',
    label: "Shows a message",
};
exports.TURNStrategyCommand = {
    id: 'TURNStrategy.command',
    label: "Shows a message",
};
exports.OUTLINE_WIDGET_FACTORY_ID = 'outline-view';
var TurnLanguageClientContribution = /** @class */ (function (_super) {
    __extends(TurnLanguageClientContribution, _super);
    function TurnLanguageClientContribution(workspace, languages, languageClientFactory, turnDiagramManagerProvider, keybindingRegistry, commandRegistry, commands, openerService) {
        var _this = _super.call(this, workspace, languages, languageClientFactory) || this;
        _this.turnDiagramManagerProvider = turnDiagramManagerProvider;
        _this.keybindingRegistry = keybindingRegistry;
        _this.commandRegistry = commandRegistry;
        _this.commands = commands;
        _this.openerService = openerService;
        _this.id = 'turn';
        _this.name = 'Turn';
        return _this;
    }
    Object.defineProperty(TurnLanguageClientContribution.prototype, "globPatterns", {
        get: function () {
            return [
                '**/*.turn'
            ];
        },
        enumerable: true,
        configurable: true
    });
    TurnLanguageClientContribution.prototype.waitForActivation = function (app) {
        return Promise.race([
            _super.prototype.waitForActivation.call(this, app),
            this.waitForOpenDiagrams(this.turnDiagramManagerProvider())
        ]);
    };
    TurnLanguageClientContribution.prototype.waitForOpenDiagrams = function (diagramManagerProvider) {
        return diagramManagerProvider.then(function (diagramManager) {
            return new Promise(function (resolve) {
                var disposable = diagramManager.onDiagramOpened(function (uri) {
                    disposable.dispose();
                    resolve(uri);
                });
            });
        });
    };
    TurnLanguageClientContribution.prototype.registerCommand = function (id, callback, thisArg) {
        return this.commands.registerCommand(id, callback, thisArg);
    };
    TurnLanguageClientContribution = __decorate([
        inversify_1.injectable(),
        __param(0, inversify_1.inject(browser_3.Workspace)),
        __param(1, inversify_1.inject(browser_3.Languages)),
        __param(2, inversify_1.inject(browser_3.LanguageClientFactory)),
        __param(3, inversify_1.inject(lib_1.DiagramManagerProvider)), __param(3, inversify_1.named('turn-diagram')),
        __param(4, inversify_1.inject(browser_1.KeybindingRegistry)),
        __param(5, inversify_1.inject(common_1.CommandRegistry)),
        __param(6, inversify_1.inject(dynamic_commands_1.ContextMenuCommands)),
        __param(7, inversify_1.inject(browser_1.OpenerService)),
        __metadata("design:paramtypes", [Object, Object, browser_3.LanguageClientFactory, Function, browser_1.KeybindingRegistry,
            common_1.CommandRegistry,
            dynamic_commands_1.ContextMenuCommands, Object])
    ], TurnLanguageClientContribution);
    return TurnLanguageClientContribution;
}(browser_3.BaseLanguageClientContribution));
exports.TurnLanguageClientContribution = TurnLanguageClientContribution;
var DiagramMenuContribution = /** @class */ (function () {
    function DiagramMenuContribution() {
    }
    DiagramMenuContribution.prototype.registerMenus = function (registry) {
        registry.registerMenuAction(OutlineContextMenu.OPEN, {
            commandId: exports.TURNDiagramCommand.id,
            label: 'Generate Diagram'
        });
        registry.registerMenuAction(OutlineContextMenu.OPEN, {
            commandId: exports.TURNStrategyCommand.id,
            label: 'Generate Diagram with Strategy'
        });
    };
    DiagramMenuContribution = __decorate([
        inversify_1.injectable()
    ], DiagramMenuContribution);
    return DiagramMenuContribution;
}());
exports.DiagramMenuContribution = DiagramMenuContribution;
var OpenInDiagramHandler = /** @class */ (function () {
    function OpenInDiagramHandler(messageService, editorManager, openerService, shell) {
        this.messageService = messageService;
        this.editorManager = editorManager;
        this.openerService = openerService;
        this.shell = shell;
    }
    OpenInDiagramHandler.prototype.execute = function () {
        var args = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            args[_i] = arguments[_i];
        }
        return __awaiter(this, void 0, void 0, function () {
            var editor, abc, uri_1, openers;
            return __generator(this, function (_a) {
                editor = this.editorManager.currentEditor;
                abc = this.shell.currentWidget;
                if (abc !== undefined) {
                    console.log("currentw idget" + abc.id);
                }
                if (editor !== undefined) {
                    uri_1 = editor.editor.uri;
                    openers = this.openerService.getOpeners(uri_1);
                    this.messageService.info("inside OpenInDiagramHandler--second--URI " + uri_1);
                    openers.then(function (openers) {
                        var opener = openers.find(function (opener) { return opener instanceof lib_1.DiagramManagerImpl; });
                        if (opener !== undefined)
                            opener.open(uri_1);
                    });
                }
                return [2 /*return*/];
            });
        });
    };
    /**
  * Reveals and selects node in the file navigator to which given widget is related.
  * Does nothing if given widget undefined or doesn't have related resource.
  *
  * @param widget widget file resource of which should be revealed and selected
  */
    OpenInDiagramHandler.prototype.selectWidgetFileNode = function (widget) {
        return __awaiter(this, void 0, void 0, function () {
            var model;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        console.log("BAHUBALI" + browser_2.Navigatable.is(widget));
                        return [4 /*yield*/, widget];
                    case 1:
                        model = (_a.sent()).model;
                        console.log("BHISMA" + model);
                        if (model !== undefined)
                            console.log("SURMA" + model.selectedNodes);
                        return [2 /*return*/];
                }
            });
        });
    };
    OpenInDiagramHandler = __decorate([
        inversify_1.injectable(),
        __metadata("design:paramtypes", [common_2.MessageService,
            browser_4.EditorManager, Object, browser_2.ApplicationShell])
    ], OpenInDiagramHandler);
    return OpenInDiagramHandler;
}());
exports.OpenInDiagramHandler = OpenInDiagramHandler;
var DiagramCommandContribution = /** @class */ (function (_super) {
    __extends(DiagramCommandContribution, _super);
    function DiagramCommandContribution(editorManager, openerService, shell) {
        var _this = _super.call(this, {
            widgetId: exports.OUTLINE_WIDGET_FACTORY_ID,
            widgetName: 'Outline',
            defaultWidgetOptions: {
                area: 'right',
                rank: 500
            },
            toggleCommandId: 'outlineView:toggle',
            toggleKeybinding: 'ctrlcmd+shift+o'
        }) || this;
        _this.editorManager = editorManager;
        _this.openerService = openerService;
        _this.shell = shell;
        return _this;
    }
    DiagramCommandContribution.prototype.registerCommands = function (registry) {
        var _this = this;
        registry.registerCommand(exports.TURNDiagramCommand, {
            execute: function () {
                _this.generateDiagram(_this.shell.currentWidget);
            }
        });
        registry.registerCommand(exports.TURNStrategyCommand, {
            execute: function () {
                _this.generateStrategyDiagram(_this.shell.currentWidget);
            },
            isVisible: function () { return _this.strategyVisibilityCheck(_this.shell.currentWidget); }
        });
    };
    DiagramCommandContribution.prototype.generateDiagram = function (widget) {
        return __awaiter(this, void 0, void 0, function () {
            var abc, model, def, _loop_1, this_1, _i, def_1, node;
            return __generator(this, function (_a) {
                abc = widget;
                model = abc.model;
                def = model.selectedNodes;
                _loop_1 = function (node) {
                    if (node !== undefined) {
                        var a = monaco_outline_contribution_1.MonacoOutlineSymbolInformationNode.is(node);
                        console.log("MOnaco" + a);
                        console.log("heyaaaaaaaaaaaaaaaa Name" + node.name);
                        var j = node;
                        console.log("heyaaaaaaaaaaaaaaaa JJJ Name" + j.name);
                        var editor = this_1.editorManager.currentEditor;
                        if (editor !== undefined) {
                            var uri = editor.editor.uri;
                            var encodedURI_1 = uri.withFragment(node.name);
                            console.log("Encoded URI" + encodedURI_1);
                            var openers = this_1.openerService.getOpeners(encodedURI_1);
                            openers.then(function (openers) {
                                var opener = openers.find(function (opener) { return opener instanceof lib_1.DiagramManagerImpl; });
                                if (opener !== undefined)
                                    opener.open(encodedURI_1, node.name);
                            });
                        }
                    }
                };
                this_1 = this;
                for (_i = 0, def_1 = def; _i < def_1.length; _i++) {
                    node = def_1[_i];
                    _loop_1(node);
                }
                return [2 /*return*/];
            });
        });
    };
    DiagramCommandContribution.prototype.generateStrategyDiagram = function (widget) {
        return __awaiter(this, void 0, void 0, function () {
            var abc, model, def, _loop_2, this_2, _i, def_2, node;
            return __generator(this, function (_a) {
                abc = widget;
                model = abc.model;
                def = model.selectedNodes;
                _loop_2 = function (node) {
                    if (node !== undefined) {
                        var a = monaco_outline_contribution_1.MonacoOutlineSymbolInformationNode.is(node);
                        console.log("MOnaco" + a);
                        console.log("heyaaaaaaaaaaaaaaaa Name" + node.name);
                        console.log("heyaaaaaaaaaaaaaaaa Icon" + node.icon);
                        console.log("heyaaaaaaaaaaaaaaaa ID" + node.id);
                        console.log("heyaaaaaaaaaaaaaaaa Parent" + node.parent);
                        console.log("heyaaaaaaaaaaaaaaaa description" + node.description);
                        console.log("heyaaaaaaaaaaaaaaaa focus" + node.focus);
                        console.log("heyaaaaaaaaaaaaaaaa next sibling" + node.nextSibling);
                        console.log("heyaaaaaaaaaaaaaaaa previous sibling" + node.previousSibling);
                        console.log("heyaaaaaaaaaaaaaaaa selected" + node.selected);
                        console.log("heyaaaaaaaaaaaaaaaa visible" + node.visible);
                        var editor = this_2.editorManager.currentEditor;
                        if (editor !== undefined) {
                            var uri = editor.editor.uri;
                            var encodedURI_2 = uri.withFragment(node.name);
                            console.log("Encoded URI" + encodedURI_2);
                            var openers = this_2.openerService.getOpeners(encodedURI_2);
                            openers.then(function (openers) {
                                var opener = openers.find(function (opener) { return opener instanceof lib_1.DiagramManagerImpl; });
                                if (opener !== undefined)
                                    opener.open(encodedURI_2, node.name);
                            });
                        }
                    }
                };
                this_2 = this;
                for (_i = 0, def_2 = def; _i < def_2.length; _i++) {
                    node = def_2[_i];
                    _loop_2(node);
                }
                return [2 /*return*/];
            });
        });
    };
    DiagramCommandContribution.prototype.strategyVisibilityCheck = function (widget) {
        var outlineWidget = widget;
        var model = outlineWidget.model;
        var mySelectedNodes = model.selectedNodes;
        if (mySelectedNodes.length > 1)
            return true;
        else
            return false;
    };
    DiagramCommandContribution = __decorate([
        inversify_1.injectable(),
        __param(0, inversify_1.inject(browser_4.EditorManager)),
        __param(1, inversify_1.inject(browser_1.OpenerService)),
        __param(2, inversify_1.inject(browser_2.ApplicationShell)),
        __metadata("design:paramtypes", [browser_4.EditorManager, Object, browser_2.ApplicationShell])
    ], DiagramCommandContribution);
    return DiagramCommandContribution;
}(browser_1.AbstractViewContribution));
exports.DiagramCommandContribution = DiagramCommandContribution;
//# sourceMappingURL=turn-language-client-contribution.js.map