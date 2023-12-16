package Structural_Patterns.Adapter.WoW;

public class FightSimulation {
    public static void main(String[] args) {
        Player player = new Player("Gandalf", 100);

        PlayerAdapter wizardAdapter = new WizardAdapter(player);

        wizardAdapter.castSpell();
        wizardAdapter.teleport();

        player.attack();
        player.defend();
        player.displayInfo();
    }
}
