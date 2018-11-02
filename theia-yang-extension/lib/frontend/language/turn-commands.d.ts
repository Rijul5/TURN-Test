import { CommandContribution, CommandRegistry, Command } from '@theia/core';
import { Workspace } from "@theia/languages/lib/common";
/**
 * Show YANG references
 */
export declare const SHOW_TURN_REFERENCES: Command;
/**
 * Apply Workspace Edit
 */
export declare const APPLY_WORKSPACE_EDIT: Command;
export declare class TURNCommandContribution implements CommandContribution {
    protected readonly workspace: Workspace;
    constructor(workspace: Workspace);
    registerCommands(commands: CommandRegistry): void;
}
//# sourceMappingURL=turn-commands.d.ts.map