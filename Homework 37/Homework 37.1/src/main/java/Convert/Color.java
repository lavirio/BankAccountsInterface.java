package Convert;

import java.util.HashMap;
import java.util.Map;

public class Color {
    final Map<String,String> colors = new HashMap<>();

    public Color() {
        colors.put("#EF161E", "RED");
        colors.put("#2DBE2C","GREEN");
        colors.put("#0078BE","DARKBLUE");
        colors.put("#00BFFF","LIGHTBLUE");
        colors.put("#8D5B2D","BROWN");
        colors.put("#ED9121","ORANGE");
        colors.put("#800080","PURPLE");
        colors.put("#FFD702","YELLOW");
        colors.put("#999999","DARKGREY");
        colors.put("#99CC00","GREEN");
        colors.put("#82C0C0","OCEAN");
        colors.put("#A1B3D4","LIGHTGREY");
        colors.put("#DE64A1","PINK");
    }

    public String getColorNameByHex(String hex) {
        return colors.get(hex);
    }
}
