package me.vik.socksapp.service;

import me.vik.socksapp.dto.SockRequest;
import me.vik.socksapp.model.Color;
import me.vik.socksapp.model.Size;
import me.vik.socksapp.model.Socks;
import org.springframework.stereotype.Service;

@Service
public interface SocksService {

    void addSocks(SockRequest sockRequest);

    void issueSocks(SockRequest sockRequest);

    void removeDefectiveSocks(SockRequest sockRequest);

    int getSocksQuantity(Color color, Size size, Integer cottonMin, Integer cottonMax);

    void validateRequest(SockRequest sockRequest);

    Socks mapToSocks(SockRequest sockRequest);
}