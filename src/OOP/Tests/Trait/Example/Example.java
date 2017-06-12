package OOP.Tests.Trait.Example;

import OOP.Provided.Trait.OOPTraitClassGenerator;
import OOP.Provided.Trait.OOPTraitConflict;
import OOP.Provided.Trait.OOPTraitException;
import OOP.Solution.Logger;
import org.junit.Assert;
import org.junit.Test;

public class Example {

    private static OOPTraitClassGenerator generator = new OOPTraitClassGenerator();
    static TraitCollector obj = null;

    @Test
    public void main() {
        try {
            Logger.isActive=true;
            obj = (TraitCollector) generator.generateTraitClassObject(TraitCollector.class);
            obj.add(3);
            obj.inc();
            Assert.assertEquals(4, obj.getValue());
            obj.add(6);
            Assert.assertEquals(10, obj.getValue());
           String s = "alo";
            Object b = new Object();
            obj.ambuigTest(s,b);
            obj.ambuigTest(b,s);
            obj.ambuigTest(s,s);
        }
        catch(OOPTraitConflict e){
            Logger.log("CONFLICT CATCH SUCCESS.\n");
        }
            catch (OOPTraitException e) {
            e.printStackTrace();
        } finally {
           generator.removeSourceFile();
        }
    }
}
