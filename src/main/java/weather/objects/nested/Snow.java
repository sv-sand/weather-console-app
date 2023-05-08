package weather.objects.nested;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author Alexander Svetlakov <sve.snd@gmail.com>
 * @since 30.04.2023
 */

@Data
public class Snow {
    // Snow volume for the last 1 hour, mm
    @SerializedName("1h")
    private double h1;

    // Snow volume for the last 3 hour, mm
    @SerializedName("3h")
    private double h3;
}