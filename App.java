public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lets get ready for a rumble!!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 500 HP and 500 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Wizard = new Wizard("Wizard");
        Warlock Warlock = new Warlock("Warlock");
        Wizard.Minazuki(Warlock);
        Wizard.KatenKyokotsu(Warlock);
        Warlock.Kamishini(Wizard);
        Wizard.Kannonbiraki(Warlock);
        Warlock.Ashisogi(Vocodah);
        Warlock.Tranquility(Warlock);
        Wizard.Rennervate(Wizard);
        Wizard.Senbonzakura(Warlock);
        Warlock.Hyōrinmaru(Wizard);
        Wizard.Shigekuni(Warlock);
    }
}
