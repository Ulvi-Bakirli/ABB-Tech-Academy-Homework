public interface HumanCreator {

    default public Human bornChild() {
        return new Human();
    }
}
