/*
Write a program that plots the sine function in red and cosine function in blue.
Hint: The Unicode for pi is \u03c0. To display -2pi, use Text(x,y,"-2\u03c0"). 
For a trigonometric function like sin(x), x is in radians. Use the following loop to add the points
to a polyline:
Polyline polyline = new Polyline();
ObservableList<Double> list = polyline.getPoints();
double scaleFactor = 50;
for (int x = -170; x <= 170; x++) {
    list.add(x + 200.0);
    list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
}
 */
package chapter14;
public class PlotSineCosine {
    
}
