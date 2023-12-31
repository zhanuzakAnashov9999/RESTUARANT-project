package zhanuzak.repository.dao;

import zhanuzak.dto.response.GlobalSearchResponse;
import zhanuzak.dto.response.MenuItemResponse;

import java.util.List;
import java.util.Optional;

public interface MenuItemJdbcTemplate {
    List<MenuItemResponse> getAll();

    Optional<MenuItemResponse> getById(Long id);

    List<MenuItemResponse> searchByName(String search);

    GlobalSearchResponse globalSearch2(String search);
}
