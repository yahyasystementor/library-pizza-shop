public enum Plant {
        KAKTUS("Kaktus", 0.5f),
        PALM("PALM", 1.0f),
        MEATEATINGPLANT("Meat eating plant", 0.8f),
        ROS("Ros", 0.5f);
        private String value;
        private float volume;
        Plant(String value,  float volume) {
                this.value = value;
                this.volume = volume;
        }

        public float getVolume() {
                return volume;
        }
        public String getValue() {
                return value;
        }


}


