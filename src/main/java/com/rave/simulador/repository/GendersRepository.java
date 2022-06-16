package com.rave.simulador.repository;

import com.rave.simulador.model.Genders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GendersRepository extends JpaRepository<Genders, Long> {

    @Query(value = "SELECT id, name from genders where id = :pid_gender", nativeQuery = true)
    Genders findGenderById(@Param("pid_gender") Integer pid_gender);


    // @Query(value = "SELECT c.id, c.ci, '' as file,c.file_name, c.file_dir, c.file_type, c.contrato, c.fecha, c.file_dir, c.linea, c.localidad, c.proceso, c.proceso_etapa, c.situacion, c.vendedor, documento_fisico, documentos_digitales, plane, proceso_etapa_atual, proceso_etapa_atual_date FROM contrato c where c.vendedor = ?1", nativeQuery = true)
    // List<Contrato> findByVendedorSituacao(String vendedor);

//    Page<Employees> findAllByVendedor(String vendedor, Pageable pegeable);
//
//    @Query(value = "select c.id, c.caja_definir_caja_del_documento_fisico, c.ruc, c.num_factura, c.num_pedido, c.descripcion, c.tipo_factura, c.iva, c.gravada, c.monto_total, c.monto_iva, c.monto_gravada, c.correio_vendedor, c.data_hora_anular_documentos, c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, c.data_hora_verificar_sospecha_de_fraude, c.eleccion_del_operador_doble_custodia, c.eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, '' as file_base64, c.file_dir, c.file_name, c.file_type, c.imagenes_rechazadas_verificar_imagenes, c.num_pedido, c.localidad, c.observacciones_del_operador_doble_custodia, c.observacciones_del_operador_verificar_sospecha_de_fraude, c.proceso, c.proceso_etapa, c.resultado_final_validacion, c.situacion, c.usuario_anular_documentos, c.usuario_definir_caja_del_documento_fisico, c.usuario_doble_custodia, c.usuario_grabar_documentos_digitales, c.usuario_informe_caja_documentos_fisicos, c.usuario_verificar_imagenes, c.usuario_verificar_sospecha_de_fraude, c.vendedor, documento_fisico, documentos_digitales, proceso_etapa_atual, proceso_etapa_atual_data,'' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where 1 = 1"
//    +" and ((:pid <= 0 or :pid is null) or (c.id = :pid))"
//	+" and ((:pruc IS null) or (c.ruc = :pruc))"
//    +" and ((:pvendedor IS null) or (c.vendedor = :pvendedor))"
//	+" and ((:pnum_factura IS null) or (c.num_factura = :pnum_factura))"
//	+" and ((:pnum_pedido IS null) or (c.num_pedido = :pnum_pedido))"
//	+" and ((:pdescripcion IS null) or (c.descripcion = :pdescripcion))"
//	+" and ((:ptipo_factura IS null) or (c.tipo_factura = :ptipo_factura))"
//	+" and ((:piva IS null) or (c.iva = :piva))"
//	+" and ((:pgravada IS null) or (c.gravada = :pgravada))"
//	+" and ((:pmonto_total IS null) or (c.monto_total = :pmonto_total))"
//	+" and ((:pmonto_iva IS null) or (c.monto_iva = :pmonto_iva))"
//	+" and ((:pmonto_gravada IS null) or (c.monto_gravada = :pmonto_gravada))"
//	+" and ((:pdepartamento IS null) or (c.departamento = :pdepartamento))"
//	+" and ((:pjustificacion_compra IS null) or (c.justificacion_compra = :pjustificacion_compra))"
//	+" and ((:pprioridad_compra IS null) or (c.prioridad_compra = :pprioridad_compra))"
//    +" and ((:pcorreiovendedor IS null) or (c.correio_vendedor = :pcorreiovendedor))"
//	+" and ((:plocalidad IS null) or (c.localidad = :plocalidad))"
//	+" and ((:psituacion IS null) or (c.situacion = :psituacion))", nativeQuery = true)
//    List<Employees> findListContratoExata(
//			@Param("pid") Long pid,
//			@Param("pruc") String pruc,
////        @Param("pcontrato") String pcontrato,
//			@Param("pvendedor") String pvendedor,
//			@Param("pnum_factura") String pnum_factura,
//			@Param("pnum_pedido") String pnum_pedido,
//			@Param("pdescripcion") String pdescripcion,
//			@Param("ptipo_factura") String ptipo_factura,
//			@Param("piva") String piva,
//			@Param("pgravada") String pgravada,
//			@Param("pmonto_total") String pmonto_total,
//			@Param("pmonto_iva") String pmonto_iva,
//			@Param("pmonto_gravada") String pmonto_gravada,
//			@Param("pcorreiovendedor") String pcorreiovendedor,
//			@Param("pdepartamento") String pdepartamento,
//			@Param("pjustificacion_compra") String pjustificacion_compra,
//			@Param("pprioridad_compra") String pprioridad_compra,
////			@Param("plinea") String plinea,
//			@Param("plocalidad") String plocalidad,
//			@Param("psituacion") String psituacion);
//
//	@Query(value = "select c.id, c.caja_definir_caja_del_documento_fisico, " +
//			"c.ci, c.num_factura, c.correio_vendedor, c.data_hora_anular_documentos, " +
//			"c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, " +
//			"c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, " +
//			"c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, " +
//			"c.data_hora_verificar_sospecha_de_fraude, c.eleccion_del_operador_doble_custodia, " +
//			"c.eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, '' as file_base64, c.file_dir, c.file_name, c.file_type, c.imagenes_rechazadas_verificar_imagenes, c.ruc, c.localidad, c.observacciones_del_operador_doble_custodia, c.observacciones_del_operador_verificar_sospecha_de_fraude, c.proceso, c.proceso_etapa, c.resultado_final_validacion, c.situacion, c.usuario_anular_documentos, c.usuario_definir_caja_del_documento_fisico, c.usuario_doble_custodia, c.usuario_grabar_documentos_digitales, c.usuario_informe_caja_documentos_fisicos, c.usuario_verificar_imagenes, c.usuario_verificar_sospecha_de_fraude, c.vendedor, documento_fisico, documentos_digitales, proceso_etapa_atual, proceso_etapa_atual_data,'' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where 1 = 1"
//			+" or (:pid > 0 and c.id = :pid)"
//			+" or (:pruc <> null and c.ruc = :pruc)"
//			+" or (:pnum_factura <> null and c.num_factura = :pnum_factura)"
//			+" or (:pvendedor <> null and c.vendedor = :pvendedor)"
//			+" or (:pcorreiovendedor <> null and c.correio_vendedor = :pcorreiovendedor)"
//			+" or (:pnum_pedido <> null and c.num_pedido = :pnum_pedido)"
//			+" or (:pdescripcion <> null and c.descripcion = :pdescripcion)"
//			+" or (:ptipo_factura <> null and c.tipo_factura = :ptipo_factura)"
//			+" or (:piva <> null and c.iva = :piva)"
//			+" or (:pgravada <> null and c.gravada = :pgravada)"
//			+" or (:pmonto_total <> null and c.monto_total = :pmonto_total)"
//			+" or (:pmonto_iva <> null and c.monto_iva = :pmonto_iva)"
//			+" or (:pmonto_gravada <> null and c.monto_gravada = :pmonto_gravada)"
//			+" or (:pmonto_total <> null and c.monto_total = :pmonto_total)"
//			+" or (:pdepartamento <> null and c.departamento = :pdepartamento)"
//			+" or (:pjustificacion_compra <> null and c.justificacion_compra = :pjustificacion_compra)"
//			+" or (:pprioridad_compra <> null and c.prioridad_compra = :pprioridad_compra)"
//			+" or (:plocalidad <> null and c.localidad = :plocalidad)"
//			+" or (:psituacion <> null and c.situacion = :psituacion)", nativeQuery = true)
//	List<Employees> findListContrato(
//			@Param("pid") Long pid,
//			@Param("pruc") String pruc,
//			@Param("pnum_factura") String pnum_factura,
//			@Param("pnum_pedido") String pnum_pedido,
//			@Param("pdescripcion") String pdescripcion,
//			@Param("ptipo_factura") String ptipo_factura,
//			@Param("piva") String piva,
//			@Param("pgravada") String pgravada,
//			@Param("pmonto_total") String pmonto_total,
//			@Param("pmonto_iva") String pmonto_iva,
//			@Param("pmonto_gravada") String pmonto_gravada,
//			@Param("pvendedor") String pvendedor,
//			@Param("pcorreiovendedor") String pcorreiovendedor,
//			@Param("pdepartamento") String pdepartamento,
//			@Param("pjustificacion_compra") String pjustificacion_compra,
//			@Param("pprioridad_compra") String pprioridad_compra,
////        @Param("plinea") String plinea,
//			@Param("plocalidad") String plocalidad,
//			@Param("psituacion") String psituacion);
//
////    @Query(value = "select c.id, '' as caja_definir_caja_del_documento_fisico, '' as ruc, '' as num_pedido, '' as correio_vendedor, c.data_hora_anular_documentos, c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, c.data_hora_verificar_sospecha_de_fraude, '' as eleccion_del_operador_doble_custodia, '' as eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, c.file_base64, c.file_dir, c.file_name, c.file_type, '' as imagenes_rechazadas_verificar_imagenes, '' as linea, '' as localidad, '' as observacciones_del_operador_doble_custodia, '' as observacciones_del_operador_verificar_sospecha_de_fraude, '' as proceso, '' as proceso_etapa, '' as resultado_final_validacion, '' as situacion, '' as usuario_anular_documentos, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_doble_custodia, '' as usuario_grabar_documentos_digitales, '' as usuario_informe_caja_documentos_fisicos, '' as usuario_verificar_imagenes, '' as usuario_verificar_sospecha_de_fraude, '' as vendedor, '' as documento_fisico, '' as documentos_digitales, '' as tipo_factura, '' as proceso_etapa_atual, proceso_etapa_atual_data, '' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where c.id = ?1 LIMIT 1", nativeQuery = true)
////    @Query(value = "select c.id, '' as caja_definir_caja_del_documento_fisico, '' as ruc, '' as num_pedido, '' as correio_vendedor, c.data_hora_anular_documentos, c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, c.data_hora_verificar_sospecha_de_fraude, '' as eleccion_del_operador_doble_custodia, '' as eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, c.file_base64, c.file_dir, c.file_name, c.file_type, '' as imagenes_rechazadas_verificar_imagenes, '' as linea, '' as localidad, '' as observacciones_del_operador_doble_custodia, '' as observacciones_del_operador_verificar_sospecha_de_fraude, '' as proceso, '' as proceso_etapa, '' as resultado_final_validacion, '' as situacion, '' as usuario_anular_documentos, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_doble_custodia, '' as usuario_grabar_documentos_digitales, '' as usuario_informe_caja_documentos_fisicos, '' as usuario_verificar_imagenes, '' as usuario_verificar_sospecha_de_fraude, '' as vendedor, '' as documento_fisico, '' as documentos_digitales, '' as plane, '' as proceso_etapa_atual, proceso_etapa_atual_data, '' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where c.id = ?1 LIMIT 1", nativeQuery = true)
////	@Query(value = "select c.id, '' as caja_definir_caja_del_documento_fisico, '' as ci, '' as contrato, '' as correio_vendedor, c.data_hora_anular_documentos, c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, c.data_hora_verificar_sospecha_de_fraude, '' as eleccion_del_operador_doble_custodia, '' as eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, c.file_base64, c.file_dir, c.file_name, c.file_type, '' as imagenes_rechazadas_verificar_imagenes, '' as linea, '' as localidad, '' as observacciones_del_operador_doble_custodia, '' as observacciones_del_operador_verificar_sospecha_de_fraude, '' as proceso, '' as proceso_etapa, '' as resultado_final_validacion, '' as situacion, '' as usuario_anular_documentos, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_doble_custodia, '' as usuario_grabar_documentos_digitales, '' as usuario_informe_caja_documentos_fisicos, '' as usuario_verificar_imagenes, '' as usuario_verificar_sospecha_de_fraude, '' as vendedor, '' as documento_fisico, '' as documentos_digitales, '' as plane, '' as proceso_etapa_atual, proceso_etapa_atual_data, '' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where c.id = ?1 LIMIT 1", nativeQuery = true)
//	@Query(value = "select c.id, '' as caja_definir_caja_del_documento_fisico, '' as ruc, '' as num_pedido, '' as num_factura, '' as descripcion, '' as tipo_factura, '' as gravada, '' as iva, '' as monto_iva, '' as monto_gravada, '' as monto_total,  '' as correio_vendedor, c.data_hora_anular_documentos, c.data_hora_definir_caja_del_documento_fisico, c.data_hora_doble_custodia, c.data_hora_grabar_documentos_digitales, c.data_hora_informe_caja_documentos_fisicos, c.data_hora_notificar_resultado_validacion, c.data_hora_verificar_imagenes, c.data_hora_verificar_sospecha_de_fraude, '' as eleccion_del_operador_doble_custodia, '' as eleccion_del_operador_verificar_sospecha_de_fraude, c.fecha_final, c.fecha_inicio, c.file_base64, c.file_dir, c.file_name, c.file_type, '' as imagenes_rechazadas_verificar_imagenes, '' as linea, '' as localidad, '' as observacciones_del_operador_doble_custodia, '' as observacciones_del_operador_verificar_sospecha_de_fraude, '' as proceso, '' as proceso_etapa, '' as resultado_final_validacion, '' as situacion, '' as usuario_anular_documentos, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_doble_custodia, '' as usuario_grabar_documentos_digitales, '' as usuario_informe_caja_documentos_fisicos, '' as usuario_verificar_imagenes, '' as usuario_verificar_sospecha_de_fraude, '' as vendedor, '' as documento_fisico, '' as documentos_digitales, '' as plane, '' as proceso_etapa_atual, proceso_etapa_atual_data, '' as respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato c where c.id = ?1 LIMIT 1", nativeQuery = true)
//	Employees contratoFileBase64ToId(Long pid);
//
//    @Query(value = "select id, num_factura, num_pedido, tipo_factura, descripcion, iva, gravada, monto_iva, monto_gravada, monto_total, localidad, caja_definir_caja_del_documento_fisico, ruc, '' as tipo_factura, '' as situacion, '' as vendedor, '' as correio_vendedor, NULL as fecha_inicio, NULL as fecha_final, '' as proceso, NULL as data_hora_anular_documentos, NULL as data_hora_definir_caja_del_documento_fisico, NULL as data_hora_doble_custodia, NULL as data_hora_grabar_documentos_digitales, NULL as data_hora_informe_caja_documentos_fisicos, NULL as data_hora_notificar_resultado_validacion, NULL as data_hora_verificar_imagenes, NULL as data_hora_verificar_sospecha_de_fraude, '' as documento_fisico, '' as documentos_digitales, '' as eleccion_del_operador_doble_custodia, '' as eleccion_del_operador_verificar_sospecha_de_fraude, '' as file, '' as file_base64, '' as file_dir, '' as file_name, '' as file_type, '' as imagenes_rechazadas_verificar_imagenes, '' as observacciones_del_operador_doble_custodia, '' as observacciones_del_operador_verificar_sospecha_de_fraude, '' as proceso_etapa, '' as proceso_etapa_atual, NULL as proceso_etapa_atual_data, '' as resultado_final_validacion, '' as usuario_anular_documentos, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_doble_custodia, '' as usuario_grabar_documentos_digitales, '' as usuario_informe_caja_documentos_fisicos, '' as usuario_verificar_imagenes, '' as usuario_verificar_sospecha_de_fraude, respostas_verificar_imagenes, supervisor_vendedor, imagens_validas from contrato where caja_definir_caja_del_documento_fisico like ?1" , nativeQuery = true)
//	List<Employees> informePorCaja(String caja);
//
//    // @Query(value = "SELECT id, contrato, linea, ci, localidad, plane, fecha_inicio, vendedor, correio_vendedor, situacion,	 proceso_etapa_atual, proceso_etapa_atual_data,	 data_hora_grabar_documentos_digitales, usuario_grabar_documentos_digitales, data_hora_verificar_imagenes, usuario_verificar_imagenes,	 imagenes_rechazadas_verificar_imagenes, data_hora_doble_custodia, usuario_doble_custodia,	 eleccion_del_operador_doble_custodia, observacciones_del_operador_doble_custodia,	 eleccion_del_operador_verificar_sospecha_de_fraude, observacciones_del_operador_verificar_sospecha_de_fraude,				 usuario_verificar_sospecha_de_fraude, data_hora_verificar_sospecha_de_fraude, data_hora_anular_documentos, usuario_anular_documentos, resultado_final_validacion, fecha_final,	 documentos_digitales,	 '' as caja_definir_caja_del_documento_fisico, '' as situacion,	 '' as proceso,	 '' as data_hora_definir_caja_del_documento_fisico, '' as data_hora_informe_caja_documentos_fisicos, '' as data_hora_notificar_resultado_validacion, '' as documento_fisico,	 '' as documentos_digitales, '' as proceso_etapa,	 '' as usuario_definir_caja_del_documento_fisico,	 '' as usuario_informe_caja_documentos_fisicos, '' as file, '' as file_base64, '' as file_dir, '' as file_name, '' as file_type FROM contrato where id = ?1 LIMIT 1", nativeQuery = true)
//	// Contrato informePorContrato(String caja);
//
//    // @Query(value = "SELECT id, contrato, linea, ci, localidad, plane, fecha_inicio, vendedor, correio_vendedor, situacion, proceso_etapa_atual, proceso_etapa_atual_data, data_hora_grabar_documentos_digitales, usuario_grabar_documentos_digitales, data_hora_verificar_imagenes, usuario_verificar_imagenes, imagenes_rechazadas_verificar_imagenes, data_hora_doble_custodia, usuario_doble_custodia, eleccion_del_operador_doble_custodia, observacciones_del_operador_doble_custodia, eleccion_del_operador_verificar_sospecha_de_fraude, observacciones_del_operador_verificar_sospecha_de_fraude,			 usuario_verificar_sospecha_de_fraude, data_hora_verificar_sospecha_de_fraude, data_hora_anular_documentos, usuario_anular_documentos, resultado_final_validacion, fecha_final, documentos_digitales, '' as caja_definir_caja_del_documento_fisico, '' as situacion, '' as proceso, '' as data_hora_definir_caja_del_documento_fisico, '' as data_hora_informe_caja_documentos_fisicos, '' as data_hora_notificar_resultado_validacion, '' as documento_fisico, '' as documentos_digitales, '' as proceso_etapa, '' as usuario_definir_caja_del_documento_fisico, '' as usuario_informe_caja_documentos_fisicos, '' as file, '' as file_base64, '' as file_dir, '' as file_name, '' as file_type FROM contrato where id = ?1 LIMIT 1", nativeQuery = true)
//    // Contrato informePorContrato(Long id);
//
//    @Query(value = "SELECT id, caja_definir_caja_del_documento_fisico, ruc, num_factura, num_pedido, tipo_factura, descripcion, iva, gravada, monto_iva, monto_gravada, monto_total, correio_vendedor, data_hora_anular_documentos, data_hora_definir_caja_del_documento_fisico, data_hora_doble_custodia, data_hora_grabar_documentos_digitales, data_hora_informe_caja_documentos_fisicos, data_hora_notificar_resultado_validacion, data_hora_verificar_imagenes, data_hora_verificar_sospecha_de_fraude, documento_fisico, documentos_digitales, eleccion_del_operador_doble_custodia, eleccion_del_operador_verificar_sospecha_de_fraude, fecha_final, fecha_inicio, imagenes_rechazadas_verificar_imagenes, num_pedido, localidad, observacciones_del_operador_doble_custodia, observacciones_del_operador_verificar_sospecha_de_fraude, tipo_factura, proceso, proceso_etapa, proceso_etapa_atual, proceso_etapa_atual_data, respostas_verificar_imagenes, resultado_final_validacion, situacion, usuario_anular_documentos, usuario_definir_caja_del_documento_fisico, usuario_doble_custodia, usuario_grabar_documentos_digitales, usuario_informe_caja_documentos_fisicos, usuario_verificar_imagenes, usuario_verificar_sospecha_de_fraude, vendedor, '' as file_base64, '' as file_dir, '' as file_name, '' as file_type, respostas_verificar_imagenes,  supervisor_vendedor,imagens_validas FROM contrato where id = ?1",  nativeQuery = true)
//    List<Employees> findByIdtoCaja(Long id);

//	@Modifying
//	@Query("insert into Employees (GENDER_ID,JOB_ID,NAME, LAST_NAME, BIRTHDATE)")
//	public int saveEmployees(@Param("GENDER_ID")Long genderId,
//							 @Param("JOB_ID")Long jobId,
//							 @Param("NAME")String name,
//							 @Param("LAST_NAME")String lastName,
//							 @Param("BIRTHDATE")Date birthDate);
    
}