public class B {
    private int B1;
    private float B2;

    // Construtor da classe B
    public B(int B1, float B2) {
        this.B1 = B1;
        this.B2 = B2;
    }

    // Getters e Setters para B1 e B2
    public int getB1() {
        return B1;
    }

    public void setB1(int B1) {
        this.B1 = B1;
    }

    public float getB2() {
        return B2;
    }

    public void setB2(float B2) {
        this.B2 = B2;
    }

    // Método MB1
    public void MB1() {
        System.out.println("Método MB1 da classe B");
    }

    // Método MB2
    public void MB2() {
        System.out.println("Método MB2 da classe B");
    }
}
