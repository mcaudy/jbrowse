package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeatureSynonym.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeatureSynonym extends org.gmod.gbol.simpleObject.generated.AbstractFeatureSynonym {

    private static final long serialVersionUID = 1L;

    public FeatureSynonym(){
        super();
    }

//    @Override
//    public Collection<AbstractSimpleObject> getWriteObjects() {
//        ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//        // Have to write yourself
//        writeObjects.add(this);
//        
//        // Singletons
//        writeObjects.addAll(this.getPublication().getWriteObjects());
//        writeObjects.addAll(this.getSynonym().getWriteObjects());
//        
//        return writeObjects;
//    }

    public AbstractSimpleObjectIterator getWriteableObjects()
    {
        return new SimpleObjectIterator(this);
    }

    private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
    {

        private static class Status extends AbstractSimpleObjectIterator.Status
        {
            public final static int pub = 1;
            public final static int synonym = 2;
        }
    
        public SimpleObjectIterator(FeatureSynonym featureSynonym)
        {
            super(featureSynonym);
        }
        
        public AbstractSimpleObject next()
        {
            FeatureSynonym featureSynonym = (FeatureSynonym)object;
            AbstractSimpleObject retVal = null;
            if (status == Status.self) {
                retVal = peek();
                processSingletonIterator(Status.pub, featureSynonym.getPublication());
            }
            else {
                retVal = soIter.next();
                if (status == Status.pub) {
                    processSingletonIterator(Status.synonym, featureSynonym.getSynonym());
                }
            }
            current = retVal;
            return retVal;
        }
    }
    
}
