package etc.lambda.practice;

@FunctionalInterface
public interface PlayerPredicate {
    boolean test(KiaPlayer kiaplyer);
}
