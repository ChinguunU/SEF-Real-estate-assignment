package enums;

public enum PropertyListType {
    RENTAL {
        @Override
        public String IdSerial() {
            return "R";
        }

        @Override
        public String pendingIdSerial() {
            return "PR";
        }

        @Override
        public String toString() {
            return "Rental";
        }
    },
    FOR_SALE {
        @Override
        public String IdSerial() {
            return "S";
        }

        @Override
        public String pendingIdSerial() {
            return "PS";
        }

        @Override
        public String toString() {
            return "ForSale";
        }
    };

    public abstract String pendingIdSerial();
    public abstract String IdSerial();
    public abstract String toString();
}
