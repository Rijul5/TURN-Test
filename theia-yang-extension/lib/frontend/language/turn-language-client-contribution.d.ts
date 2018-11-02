import { FrontendApplication, KeybindingRegistry, OpenerService, AbstractViewContribution, Widget } from '@theia/core/lib/browser';
import { ApplicationShell } from '@theia/core/lib/browser';
import { BaseLanguageClientContribution, LanguageClientFactory, Languages, Workspace } from '@theia/languages/lib/browser';
import { DiagramManagerProvider, DiagramManager } from 'theia-sprotty/lib';
import { CommandRegistry, Disposable, MenuPath, MenuModelRegistry, MenuContribution, CommandContribution, CommandHandler } from '@theia/core/lib/common';
import { ContextMenuCommands } from './dynamic-commands';
import { MessageService } from '@theia/core/lib/common';
import { EditorManager } from "@theia/editor/lib/browser";
import { OutlineViewWidget } from '@theia/outline-view/lib/browser/outline-view-widget';
export declare const OUTLINE_CONTEXT_MENU: MenuPath;
export declare namespace OutlineContextMenu {
    const OPEN: string[];
    const OPEN_WITH: string[];
}
export declare const TURNDiagramCommand: {
    id: string;
    label: string;
};
export declare const TURNStrategyCommand: {
    id: string;
    label: string;
};
export declare const OUTLINE_WIDGET_FACTORY_ID = "outline-view";
export declare class TurnLanguageClientContribution extends BaseLanguageClientContribution {
    protected turnDiagramManagerProvider: DiagramManagerProvider;
    protected keybindingRegistry: KeybindingRegistry;
    protected commandRegistry: CommandRegistry;
    protected commands: ContextMenuCommands;
    protected readonly openerService: OpenerService;
    readonly id: string;
    readonly name: string;
    constructor(workspace: Workspace, languages: Languages, languageClientFactory: LanguageClientFactory, turnDiagramManagerProvider: DiagramManagerProvider, keybindingRegistry: KeybindingRegistry, commandRegistry: CommandRegistry, commands: ContextMenuCommands, openerService: OpenerService);
    protected readonly globPatterns: string[];
    waitForActivation(app: FrontendApplication): Promise<any>;
    protected waitForOpenDiagrams(diagramManagerProvider: Promise<DiagramManager>): Promise<any>;
    registerCommand(id: string, callback: (...args: any[]) => any, thisArg?: any): Disposable;
}
export declare class DiagramMenuContribution implements MenuContribution {
    registerMenus(registry: MenuModelRegistry): void;
}
export declare class OpenInDiagramHandler implements CommandHandler {
    private readonly messageService;
    protected readonly editorManager: EditorManager;
    protected readonly openerService: OpenerService;
    protected readonly shell: ApplicationShell;
    constructor(messageService: MessageService, editorManager: EditorManager, openerService: OpenerService, shell: ApplicationShell);
    execute(...args: any[]): Promise<void>;
    /**
  * Reveals and selects node in the file navigator to which given widget is related.
  * Does nothing if given widget undefined or doesn't have related resource.
  *
  * @param widget widget file resource of which should be revealed and selected
  */
    selectWidgetFileNode(widget: OutlineViewWidget): Promise<void>;
}
export declare class DiagramCommandContribution extends AbstractViewContribution<OutlineViewWidget> implements CommandContribution {
    protected readonly editorManager: EditorManager;
    protected readonly openerService: OpenerService;
    protected readonly shell: ApplicationShell;
    constructor(editorManager: EditorManager, openerService: OpenerService, shell: ApplicationShell);
    registerCommands(registry: CommandRegistry): void;
    generateDiagram(widget: Widget | undefined): Promise<void>;
    generateStrategyDiagram(widget: Widget | undefined): Promise<void>;
    private strategyVisibilityCheck;
}
//# sourceMappingURL=turn-language-client-contribution.d.ts.map