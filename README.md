# DOSW_Parcial_T1_JulianMorales

---
# CALIFICADO SOBRE 4.5 - ENUNCIADO 2

## 1. DIAGRAMA DE CONTEXTO

<img width="818" height="703" alt="image" src="https://github.com/user-attachments/assets/a852297c-a779-4f47-8ce6-c1187787e6d9" />


## 2. IDENTIFICAR REQUERIMIENTOS

**FUNCIONALES**

**1.CHAIN OF RESPONSABILITY**


<img width="674" height="212" alt="image" src="https://github.com/user-attachments/assets/dcbb3d8f-5a69-41eb-b4c6-6d3de4b0e439" />

**2.ADAPTER**

<img width="678" height="174" alt="image" src="https://github.com/user-attachments/assets/e7ed92d8-1dc2-4552-befc-96211ae10083" />


**3.**


<img width="677" height="178" alt="image" src="https://github.com/user-attachments/assets/4a4c19a4-d4b7-4ec2-b6a3-7d28ea431f95" />


**NO FUNCIONALES**

**1.**

<img width="700" height="170" alt="image" src="https://github.com/user-attachments/assets/02c9e787-6e33-408f-af37-6bbe45598396" />


**2.**

<img width="673" height="140" alt="image" src="https://github.com/user-attachments/assets/93485ceb-4684-445a-879b-70b9f40a988e" />


## 3. HISTORIA DE USO

<img width="563" height="308" alt="image" src="https://github.com/user-attachments/assets/8a5b4a2a-3364-43c8-ad2c-e4a69cfaf7dd" />

## 4. 

**REQUERIMIENTO 1**

<img width="549" height="353" alt="image" src="https://github.com/user-attachments/assets/aa63f6a6-8d78-4555-b9dd-42dbd41aa657" />


<img width="688" height="325" alt="image" src="https://github.com/user-attachments/assets/73c36688-99c9-47a5-add3-058801a28c20" />


<img width="345" height="123" alt="image" src="https://github.com/user-attachments/assets/b810249e-e409-4e90-96d9-9085bee20c98" />


---

**REQUERIMIENTO 2**

<img width="548" height="482" alt="image" src="https://github.com/user-attachments/assets/38ecf43a-2d0d-4ba9-9c69-161e7aa2780a" />

<img width="549" height="392" alt="image" src="https://github.com/user-attachments/assets/c5ae26a3-e156-4372-9b8f-509ee6bf9f2a" />


<img width="421" height="448" alt="image" src="https://github.com/user-attachments/assets/fc006889-c4c2-4d5a-8c1a-ab5a2e2d48b7" />

---
<img width="414" height="40" alt="image" src="https://github.com/user-attachments/assets/41305870-d78b-453e-bc54-57eb2d7defa0" />

---
## 5. Descomposición de tareas 

**Épica:** Pagos de Bob's Barber

**Descripción**
- Permitir que el cliente pague su turno sin importar el medio de pago que use, y que internamente todos los pagos se manejen de la misma forma sin importar cómo responda cada proveedor.

**Feature:** Procesamiento de pago multipasarela
- ¿Quién obtiene valor?: Cliente, Administrador, Barbería recibe el cobro sin fallas por integración.

**Historia de Usuario:**
- Como cliente, quiero pagar mi turno con Nequi, PSE, Stripe o efectivo, para usar el medio que ya tengo a la mano sin que el sistema me pida datos ni pasos distintos según el proveedor.

**Criterios de aceptación:**
- Dado que elijo un medio de pago válido, cuando confirmo el pago, entonces recibo un estado claro: APROBADO, RECHAZADO o PENDING.
- Dado que pago con PSE y el banco es Bancolombia, cuando el resultado queda en código 10, entonces el turno queda confirmado en estado PENDING.
- Dado que elijo una pasarela sin adaptador disponible, cuando intento pagar, entonces el sistema rechaza el pago y no confirma el turno.

**Tareas:**
1. Definir el contrato de respuesta único para cualquier pasarela (paymentId, estado, mensaje).
2. Crear el adaptador para Nequi, traduciendo su respuesta al contrato único.
3. Crear el adaptador para PSE, incluyendo el caso especial de Bancolombia en PENDING.
4. Crear el adaptador para Stripe y para el pago en efectivo.
5. Simular las reglas de cada proveedor (terminación 65, cuentas 1/2/3/4, cvv 555, monto ≥ $10.000).

---
## 6. Modelado

