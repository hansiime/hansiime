public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void Kamishini(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Kamishini (Damage - 100 , Mana Cost - 100)");
        int damagePoints = 100;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 100;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Ash(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Ashisogi (Damage - 100 , Mana Cost - 50)");
        int damagePoints = 100;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Ogimaru(Character characterName) {
        System.out.println("Both use Heal");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use Tranquility (Heal - 100)");
        int healPoints = 100;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Hyōrinmaru(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Hyōrinmaru (Damage - 75 , Mana Cost - 30)");
        int damagePoints = 75;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);
    }
}
