package com.estudo.inventory.services;

import com.estudo.inventory.dto.PurchaseOrderDTO;
import com.estudo.inventory.entities.PurchaseOrder;
import com.estudo.inventory.entities.enums.PurchaseOrderStatus;
import com.estudo.inventory.repositories.PurchaseOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService extends BaseService<PurchaseOrder, PurchaseOrderDTO, Long> {

    public PurchaseOrderService(PurchaseOrderRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSave(PurchaseOrder purchaseOrder) {
        if (purchaseOrder.getId() == null) {
            purchaseOrder.setStatus(PurchaseOrderStatus.WAITING_APPROVAL);
        }
    }
}
