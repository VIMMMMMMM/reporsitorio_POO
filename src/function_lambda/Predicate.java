package function_lambda;

public class Predicate implements java.util.function.Predicate<Produto> {
    @Override
    public boolean test(Produto p) {
        return false;
    }
}
