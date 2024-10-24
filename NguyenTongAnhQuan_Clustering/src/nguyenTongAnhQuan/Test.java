package nguyenTongAnhQuan;

public class Test {
	public static void main(String[] args) throws Exception {
		Clustering cluster = new Clustering();
		cluster.loadata("C:\\Users\\DELL\\Documents\\Khai thac du lieu ung dung\\BTThucHanh\\TH_CuoiKy\\Cardiology.arff");
		cluster.build_Kmeans(3,true);
		System.out.println(cluster.output_kmeans());
		cluster.Predict_Kmeans();
	}

}
