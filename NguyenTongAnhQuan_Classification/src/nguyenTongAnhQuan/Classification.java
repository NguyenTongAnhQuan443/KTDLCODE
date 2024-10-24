package nguyenTongAnhQuan;

import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Classification {
	DataSource source;
	J48 j48;
	Evaluation eval;
	
	public Instances loaddata(String filename) throws Exception {
		source = new DataSource(filename);
		return source.getDataSet();
	}
	
	public void build_j48(Instances datatrain) throws Exception {
		datatrain.setClassIndex(datatrain.numAttributes()-1);
		j48 = new J48();
		j48.buildClassifier(datatrain);
		
	}
	
	public void eval_j48(Instances datatest, int k) throws Exception {
		datatest.setClassIndex(datatest.numAttributes()-1);
		eval = new Evaluation(datatest);
		eval.evaluateModel(j48, datatest);
	}
	public String output_J48model() {
		return j48.toString();
	}
	
	
}
