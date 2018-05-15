package de.daddyplay.labyvault.module;

import de.daddyplay.labyvault.Main;
import net.labymod.ingamegui.ModuleCategory;
import net.labymod.ingamegui.moduletypes.SimpleTextModule;
import net.labymod.settings.elements.ControlElement;
import net.labymod.utils.Material;

public class JobModule extends SimpleTextModule {

    @Override
    public String[] getValues() {
        return Main.userData.getLevel();
    }

    @Override
    public String[] getDefaultValues() {
        return new String[0];
    }

    @Override
    public String[] getKeys() {
        return Main.userData.getJobs();
    }

    @Override
    public String[] getDefaultKeys() {
        return new String[0];
    }

    @Override
    public ControlElement.IconData getIconData() {
        return new ControlElement.IconData(Material.IRON_PICKAXE);
    }

    @Override
    public void loadSettings() {

    }

    @Override
    public String getSettingName() {
        return "Jobs";
    }

    @Override
    public String getDescription() {
        return "Jobs Display";
    }

    @Override
    public int getSortingId() {
        return 0;
    }

    @Override
    public ModuleCategory getCategory() {
        return new LabyVaultModuleCategory();
    }

    @Override
    public String getName() {
        return "Jobs";
    }
}
