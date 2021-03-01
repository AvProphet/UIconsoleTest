package menu;

import java.io.IOException;
import java.util.Map;

public class Menu {
    private String name;
    private Map<Integer, SubMenu> subMenu;

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, SubMenu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(Map<Integer, SubMenu> subMenu) {
        this.subMenu = subMenu;
    }

    public void addToMap (Map<Integer, SubMenu> subMenu) throws IOException {
        this.subMenu = subMenu;
    }

}

