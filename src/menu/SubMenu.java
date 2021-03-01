package menu;

import java.io.IOException;
import java.util.Map;

public class SubMenu {
    private String name;
    private Map<Integer, SubMenu> subMenu;

    public SubMenu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToMap (Map<Integer, SubMenu> subMenu) throws IOException {
        this.subMenu = subMenu;
    }

}
