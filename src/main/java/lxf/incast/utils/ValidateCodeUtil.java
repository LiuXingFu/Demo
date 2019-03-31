package lxf.incast.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 验证码生成工具
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 下午4:04:37
 */
public class ValidateCodeUtil {
	
	public static void main(String[] args)throws Exception {
		genNewCode(new FileOutputStream(new File("e:/code2.png")));
	}

	/**
	 * 用于产生新的验证码
	 * @param out
	 * @throws IOException
	 */
	public static String genNewCode(OutputStream out) throws IOException {
		/**
		 * 1.产生一张图片
		 */
		/**
		 * 参数一： 图片宽度
		 * 参数二： 图片高度
		 * 参数三： 图片类型
		 */
		int width = 80;
		int height = 30;
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		/**
		 * 设置图片
		 */
		Graphics g = image.getGraphics();//画笔
		g.setColor(new Color(200,200,200));//设置颜色
		g.fillRect(0, 0, width, height);//画矩形
		
		/**
		 * 随机生成四个数字(0-9)
		 */
		Random random = new Random();
		StringBuffer nums = new StringBuffer();
		for(int i=1;i<=4;i++){
			nums.append(random.nextInt(10));
		}
		g.setColor(Color.BLACK);//黑色
		/**
		 * 字体 ：类型 、 样式、大小
		 */
		g.setFont(new Font("黑体",Font.ITALIC,22));//设置字体
		g.drawString(nums.toString(), 15, 20);//写文字
		
		/**
		 * 添加随机干扰线
		 */
		for(int i=1;i<=20;i++){
			int x1 = random.nextInt(width)-10;
			int y1 = random.nextInt(height);
			int x2 = random.nextInt(width);
			int y2 = random.nextInt(height)+10;
			//随机颜色
			g.setColor(getColor());
			g.drawLine(x1, y1, x2, y2);//画线
		}
		
		/**
		 * 2.把图片输出到硬盘
		 */
		/**
		 * 参数一： 图片对象
		 * 参数二： 图片格式
		 * 参数三： 输出位置
		 */
		//File file = new File("e:/code.png");
		ImageIO.write(image, "png", out);
		out.close();
		return nums.toString();
	}
	
	/**
	 * 返回随机颜色对象
	 * @return
	 */
	private static Color getColor(){
		Random ran = new Random();
		int r = ran.nextInt(256);
		int g = ran.nextInt(256);
		int b = ran.nextInt(256);
		return new Color(r,g,b);
	}
}
