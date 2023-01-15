package me.vik.socksapp.dto;

import lombok.Data;
import me.vik.socksapp.model.Color;
import me.vik.socksapp.model.Size;
import me.vik.socksapp.model.Socks;

@Data
public class SockRequest {

    private Color color;

    private Size size;

    private int cottonPart;

    private int quantity;

    public Color getColor() {
        return color;
    }
}
