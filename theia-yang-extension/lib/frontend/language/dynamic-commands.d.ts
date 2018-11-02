import { CommandRegistry, MenuModelRegistry, Disposable } from '@theia/core';
import { EditorManager } from '@theia/editor/lib/browser';
export declare class ContextMenuCommands {
    protected menuRegistry: MenuModelRegistry;
    protected registry: CommandRegistry;
    protected editorManager: EditorManager;
    constructor(menuRegistry: MenuModelRegistry, registry: CommandRegistry, editorManager: EditorManager);
    registerCommand(id: string, callback: (...args: any[]) => any, thisArg?: any): Disposable;
    private isTURNEditor;
}
//# sourceMappingURL=dynamic-commands.d.ts.map