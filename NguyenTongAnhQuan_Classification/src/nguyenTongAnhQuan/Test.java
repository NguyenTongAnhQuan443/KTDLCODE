package nguyenTongAnhQuan;

import weka.core.Instances;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Instances datatrain,datatest;
		Classification classify = new Classification();
		datatrain = classify.loaddata("C:\\Users\\DELL\\Documents\\Khai thac du lieu ung dung\\BTThucHanh\\TH_CuoiKy\\Cardiology.arff");
		classify.build_j48(datatrain);
		System.out.println(classify.output_J48model());
		
		
		datatest = classify.loaddata("C:\\Users\\DELL\\Documents\\Khai thac du lieu ung dung\\BTThucHanh\\TH_CuoiKy\\Cardiology.arff");
		classify.build_j48(datatest);
		System.out.println(classify.output_J48model());
	}

}
