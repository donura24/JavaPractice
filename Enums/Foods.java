package JavaPractice.Enums;

public enum Foods {

    TOMATO(20),
    BROCCOLI(5),
    CARROT(40),
    POTATO(30),
    BANANA(90);

    final int levelOfSweetness;

    Foods(int levelOfSweetness) {
        this.levelOfSweetness = levelOfSweetness;
    }
}
