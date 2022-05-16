public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Ottoki(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Minazuki (Damage - 100 , Mana Cost - 10)");
        int damagePoints = 100;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Ithcigo(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with KatenKyokotsu (Damage - 250 , Mana Cost - 500)");
        int damagePoints = 250;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 500;
        manaTarget(enemyCharacter, manaPoints);

    }

        public void Kannonbiraki(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Kannonbiraki (Damage - 250 , Mana Cost - 100)");
        int damagePoints = 250;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 100;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Rennervate(Character characterName) {
        System.out.println(super.characterName + " Use Rennervate (Heal - 100)");
        int healPoints = 100;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void Senbonzakura(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Senbonzakura (Damage - 25 , Mana Cost - 25)");
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void Shigekuni(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Shigekuni (Damage - 25 , Mana Cost - 10)");
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}
