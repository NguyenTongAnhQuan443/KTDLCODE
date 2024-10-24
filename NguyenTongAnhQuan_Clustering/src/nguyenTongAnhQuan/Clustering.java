package nguyenTongAnhQuan;

import weka.clusterers.SimpleKMeans;
import weka.core.EuclideanDistance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ManhattanDistance;
import weka.core.converters.ConverterUtils.DataSource;

public class Clustering {
	DataSource source;
	Instances data;
	SimpleKMeans kMeans;
	
	public void loadata(String filename) throws Exception {
		source = new DataSource(filename);
		data = source.getDataSet();
	}
	
	public void build_Kmeans(int num,boolean isManhattan) throws Exception {
		kMeans = new SimpleKMeans();
		kMeans.setNumClusters(num);
		if(isManhattan)
			kMeans.setDistanceFunction(new ManhattanDistance());
		else
			kMeans.setDistanceFunction(new EuclideanDistance());
		kMeans.buildClusterer(data);
		
	}
	
	public void Predict_Kmeans() throws Exception {
		for(Instance inst : data)
		{
			int num = kMeans.clusterInstance(inst);
			System.out.println(inst.toString()+ " Thuộc vào cụm " + num );
		}
	}
	public String output_kmeans() {
		return kMeans.toString();
	}
}