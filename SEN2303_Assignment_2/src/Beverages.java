abstract class Beverages {
    private boolean wantsExtras;


    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();


    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }


    final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    // wantsExtras
    void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
