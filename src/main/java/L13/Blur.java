package L13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * L13: Размытие
 */
public class Blur {
    public static int castColorTo8BitsValue(double value) {
        int color = (int) value;

        if (color < 0) {
            return 0;
        }

        return Math.min(color, 255);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage baseImage = ImageIO.read(new File("image.jpg"));

        WritableRaster baseRaster = baseImage.getRaster();

        BufferedImage workImage = new BufferedImage(baseRaster.getWidth(), baseRaster.getHeight(), BufferedImage.TYPE_INT_RGB);

        WritableRaster workRaster = workImage.getRaster();

        final int colorsInRGBCount = 3;

        int[] pixel = new int[colorsInRGBCount];
        // обработка матрицы свертки
        int convolutionMatrixDimension = 3;
        double convolutionMatrixElementBlurCoefficient = 1.0 / (convolutionMatrixDimension * convolutionMatrixDimension);
        double[][] convolutionMatrix = new double[convolutionMatrixDimension][convolutionMatrixDimension];

        for (double[] pixelsRow : convolutionMatrix) {
            Arrays.fill(pixelsRow, convolutionMatrixElementBlurCoefficient);
        }

        int borderIndent = convolutionMatrixDimension / 2;
        int modifiedWidth = baseRaster.getWidth() - borderIndent;
        int modifiedHeight = baseRaster.getHeight() - borderIndent;

        // проход по изображению
        for (int y = borderIndent; y < modifiedHeight; ++y) {
            for (int x = borderIndent; x < modifiedWidth; ++x) {
                // собираем матрицу для определения пикселя
                double newRedColor = 0;
                double newGreenColor = 0;
                double newBlueColor = 0;

                for (int i = -borderIndent; i <= borderIndent; ++i) {
                    for (int j = -borderIndent; j <= borderIndent; ++j) {
                        baseRaster.getPixel(x + i, y + j, pixel);

                        newRedColor += convolutionMatrix[i + borderIndent][j + borderIndent] * pixel[0];
                        newGreenColor += convolutionMatrix[i + borderIndent][j + borderIndent] * pixel[1];
                        newBlueColor += convolutionMatrix[i + borderIndent][j + borderIndent] * pixel[2];
                    }
                }

                pixel[0] = castColorTo8BitsValue(newRedColor);
                pixel[1] = castColorTo8BitsValue(newGreenColor);
                pixel[2] = castColorTo8BitsValue(newBlueColor);

                workRaster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(workImage, "png", new File("out.png"));
    }
}

