public enum A_week {
    MONDAY {
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну жава окуйм");
        }
    }, TUESDAY {
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну жава окуйм");

        }
    };

    public abstract void method();



}
