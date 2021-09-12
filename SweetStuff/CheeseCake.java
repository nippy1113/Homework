package SweetStuff;

    public class CheeseCake extends Sweetness {
        private String cheeseType; // Переменная указывающая на то из какого сыра сделан чизкейк

        public CheeseCake(int cost, String name, double weight, String cheeseType) {
            super(cost, name, weight);
            this.cheeseType = cheeseType;
        }

        public String getCheeseType() {
            return cheeseType;
        }

        public void setCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
        }

        @Override
        public void getInfo() {
            super.getInfo();
            System.out.println(", Cheese type: "   + cheeseType);
        }
    }

