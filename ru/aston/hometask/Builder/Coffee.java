package aston.hometask.Builder;

public class Coffee {
    private String type;
    private boolean sugar;
    private boolean milk;
    private String syrup;

    private Coffee(Builder builder) {
        this.type = builder.type;
        this.sugar = builder.sugar;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
    }

    public String getType() {
        return type;
    }

    public boolean hasSugar() {
        return sugar;
    }

    public boolean hasMilk() {
        return milk;
    }

    public String getSyrup() {
        return syrup;
    }

    public static class Builder {
        private final String type;
        private boolean sugar = false;
        private boolean milk = false;
        private String syrup = null;

        public Builder(String type) {
            this.type = type;
        }

        public Builder sugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public Builder milk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public Builder syrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}
