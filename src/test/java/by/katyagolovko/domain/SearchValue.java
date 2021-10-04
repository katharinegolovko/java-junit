package by.katyagolovko.domain;

public enum SearchValues {

        SELENIDE("Selenide"),
        ALLURE("Allure");

        private String value;

        SearchValues(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}
