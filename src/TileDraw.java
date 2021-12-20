import yield.components.YldComponent;
import yield.display.YldGraphical;

import java.awt.*;

public class TileDraw extends YldComponent implements YldGraphical {

    @Override
    public void draw(Graphics g) {
        if(TileSystem.tiles != null) {
            for(Tile tile : TileSystem.tiles) {
                if(tile != null)
                g.drawImage(tile.getTileImage(), tile.getX() + Camera.x, tile.getY() + Camera.y, Tile.getWidth(), Tile.getHeight(), null);
            }
        }
    }
}