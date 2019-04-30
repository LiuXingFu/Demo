package lxf.incast.test;

import java.io.File;

/**
 * 删除图片
 * @author 我有一个小梦想
 * 
 * @date 2019年4月30日 下午4:07:31
 */
public class ImgTest {
	
	public static void main(String[] args) {
		String path = "D:\\String\\user_img\\";
		String img = "aead5d56-5b83-42f6-af32-5bcbe850b02e.jpg";
		File file = new File(path+img);
		//file.delete();
		boolean filetrue = file.exists();
		System.out.println(filetrue);
		if(filetrue){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
