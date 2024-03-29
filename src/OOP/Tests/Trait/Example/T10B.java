package OOP.Tests.Trait.Example;

import OOP.Provided.Trait.OOPTraitException;
import OOP.Solution.Trait.OOPTraitBehaviour;
import OOP.Solution.Trait.OOPTraitMethod;
import OOP.Solution.Trait.OOPTraitMethodModifier;

/**
 * Created by danie_000 on 6/19/2017.
 */
@OOPTraitBehaviour
public interface T10B {
    @OOPTraitMethod(modifier = OOPTraitMethodModifier.INTER_IMPL)
    default String winUltimate(Object p1,Object p2) throws OOPTraitException {
        return "T10B :)";
    }
    @OOPTraitMethod
    default String throwShuriken() throws OOPTraitException {
        return "Fake T10B ^^, check dynamic dispatch affect!";
    }
}
