package function_lambda;

import java.util.List;
import java.util.function.Predicate;
public class ClassesTeste {
    public double somaLista(List<Produto>list, Predicate<Produto> criterio){
        double Soma= 0.0;
        for ( Produto p:list) {
            if (criterio.test(p))
                Soma+=p.getPreco();
        }
        return Soma;
    }
}
