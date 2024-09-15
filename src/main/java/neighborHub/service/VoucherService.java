package neighborHub.service;

import neighborHub.model.dto.VoucherDtoRequest;
import neighborHub.model.dto.VoucherDtoResponse;

import java.util.List;

public interface VoucherService {
    List<VoucherDtoResponse> viewListAllVoucher();

    VoucherDtoResponse createVoucher(VoucherDtoRequest voucher);

    VoucherDtoResponse updateVoucher(VoucherDtoRequest voucher, Long id);

    Boolean deleteVoucher(Long id);
}