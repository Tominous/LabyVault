package de.daddyplay.labyvault.module;

import net.labymod.ingamegui.ModuleCategory;
import net.labymod.settings.elements.ControlElement;
import net.labymod.utils.Material;

public class LabyVaultModuleCategory extends ModuleCategory {
    public LabyVaultModuleCategory() {
        super("LabyVault", true, new ControlElement.IconData(Material.EMERALD));
    }
}
