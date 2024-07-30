//code for demonstrating Object Class in java and its methods (toString, hashcode(), equals())

class A {

    String model;
    int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model=" + model + ", price=" + price ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

class Demo {

    public static void main(String[] args) {

        A obj = new A();
        obj.setModel("Lenovo");
        obj.setPrice(1000);

        A obj1 = new A();
        obj1.setModel("Acer");
        obj1.setPrice(900);

        System.out.println(obj.toString());
        System.out.println(obj1.toString());

        obj.hashCode();
        obj1.hashCode();

        System.out.println(obj.equals(obj1));

    }
}