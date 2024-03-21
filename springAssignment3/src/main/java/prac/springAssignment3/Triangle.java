package prac.springAssignment3;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Triangle {
	@Value("Pyramid")
	private String triangle_name;
	
	@Value("Blue")
	private String triangle_color;
	
	@Value("23.6")
	private double height;

	@Value("11.5")
	private double width;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangle(String triangle_name, String triangle_color, double height, double width) {
		super();
		this.triangle_name = triangle_name;
		this.triangle_color = triangle_color;
		this.height = height;
		this.width = width;
	}
	public String getTriangle_name() {
		return triangle_name;
	}
	public void setTriangle_name(String triangle_name) {
		this.triangle_name = triangle_name;
	}
	public String getTriangle_color() {
		return triangle_color;
	}
	public void setTriangle_color(String triangle_color) {
		this.triangle_color = triangle_color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Triangle [Name : " + triangle_name + ", Color : " + triangle_color + ", Height : " + height
				+ ", Width : " + width + "]";
	}
	
}
