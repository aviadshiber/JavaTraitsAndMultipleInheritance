package OOP.Tests.Trait.Example;

import OOP.Provided.Trait.OOPTraitException;
import OOP.Solution.Trait.OOPTraitBehaviour;
import OOP.Solution.Trait.OOPTraitMethod;

/**
 * Created by danie_000 on 6/19/2017.
 */
@OOPTraitBehaviour
public interface T10D {
    @OOPTraitMethod
    default String winUltimate(A p1,Object p2) throws OOPTraitException {
        return "Fake T10D :(";
    }

}
