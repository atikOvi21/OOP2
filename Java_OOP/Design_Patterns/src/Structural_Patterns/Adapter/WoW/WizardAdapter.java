package Structural_Patterns.Adapter.WoW;

public class WizardAdapter implements PlayerAdapter {
    private final Player player;

    public WizardAdapter(Player player) {
        this.player = player;
    }

    @Override
    public void castSpell() {
        System.out.println(player.getName() + " casts a spell!");
    }

    @Override
    public void teleport() {
        System.out.println(player.getName() + " teleports!");
    }
}