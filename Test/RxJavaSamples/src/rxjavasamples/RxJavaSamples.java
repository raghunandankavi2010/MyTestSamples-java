package rxjavasamples;

import java.util.ArrayList;
import java.util.Arrays;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 *
 * @author Raghunandan
 */
public class RxJavaSamples {

    /**
     * @param args the command line arguments
     */
    public RxJavaSamples() {

    }

    public static void main(String[] args) {

        /*Observable flatmap test using lambda */
        Integer[] values = {23, 32, 42, 56, 100};
        ArrayList<Integer> valuesList = new ArrayList<Integer>(Arrays.asList(values));
        // from takes a collection of values and return a Observable
        Observable<Integer> test = Observable.from(valuesList);
        // flatmap takes a input in this case a integer and converts into Observables of type String
        test.flatMap((Integer t) -> getString(t));
        // on call function
        test.subscribe(valuestring -> System.out.println(valuestring));

        // The Reverse without using lambda
        String values1[] = {"1", "32", "42", "56", "100"};
        ArrayList<String> valuesList1 = new ArrayList<>(Arrays.asList(values1));
        // from takes a collection of values and return a Observable
        Observable<String> test1 = Observable.from(valuesList1);
        test1.flatMap(func);
        test1.subscribe(onNextAction);

    }

    //just creates a Observable
    static Observable<String> getString(Integer intvalue) {
        return Observable.just(String.valueOf(intvalue));
    }

    //
    static Observable<Integer> getInt(String value) {
        return Observable.just(Integer.parseInt(value));
    }

    static Action1<String> onNextAction = new Action1<String>() {
        @Override
        public void call(String s) {
            System.out.print("Values "+s+" ");
        }
    };
    
    static Func1<String,Observable<Integer>> func = new Func1<String,Observable<Integer>>()
    {
         @Override
        public Observable<Integer> call(String s) {
            return getInt(s);
        }
    };

}
