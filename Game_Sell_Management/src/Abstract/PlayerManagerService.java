package Abstract;
import Entities.Player;

public interface PlayerManagerService {
    void registerPlayer(Player player);
    void deletePlayer(Player player);
    void updatePlayer(Player player);
}
