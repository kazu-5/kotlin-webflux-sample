/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog;


import nu.studer.sample.pg_catalog.tables.PgAggregate;
import nu.studer.sample.pg_catalog.tables.PgAm;
import nu.studer.sample.pg_catalog.tables.PgAmop;
import nu.studer.sample.pg_catalog.tables.PgAmproc;
import nu.studer.sample.pg_catalog.tables.PgAttrdef;
import nu.studer.sample.pg_catalog.tables.PgAttribute;
import nu.studer.sample.pg_catalog.tables.PgAuthMembers;
import nu.studer.sample.pg_catalog.tables.PgAuthid;
import nu.studer.sample.pg_catalog.tables.PgCast;
import nu.studer.sample.pg_catalog.tables.PgClass;
import nu.studer.sample.pg_catalog.tables.PgCollation;
import nu.studer.sample.pg_catalog.tables.PgConstraint;
import nu.studer.sample.pg_catalog.tables.PgConversion;
import nu.studer.sample.pg_catalog.tables.PgDatabase;
import nu.studer.sample.pg_catalog.tables.PgDbRoleSetting;
import nu.studer.sample.pg_catalog.tables.PgDefaultAcl;
import nu.studer.sample.pg_catalog.tables.PgDepend;
import nu.studer.sample.pg_catalog.tables.PgDescription;
import nu.studer.sample.pg_catalog.tables.PgEnum;
import nu.studer.sample.pg_catalog.tables.PgEventTrigger;
import nu.studer.sample.pg_catalog.tables.PgExtension;
import nu.studer.sample.pg_catalog.tables.PgForeignDataWrapper;
import nu.studer.sample.pg_catalog.tables.PgForeignServer;
import nu.studer.sample.pg_catalog.tables.PgForeignTable;
import nu.studer.sample.pg_catalog.tables.PgIndex;
import nu.studer.sample.pg_catalog.tables.PgInherits;
import nu.studer.sample.pg_catalog.tables.PgInitPrivs;
import nu.studer.sample.pg_catalog.tables.PgLanguage;
import nu.studer.sample.pg_catalog.tables.PgLargeobject;
import nu.studer.sample.pg_catalog.tables.PgLargeobjectMetadata;
import nu.studer.sample.pg_catalog.tables.PgNamespace;
import nu.studer.sample.pg_catalog.tables.PgOpclass;
import nu.studer.sample.pg_catalog.tables.PgOperator;
import nu.studer.sample.pg_catalog.tables.PgOpfamily;
import nu.studer.sample.pg_catalog.tables.PgPartitionedTable;
import nu.studer.sample.pg_catalog.tables.PgPolicy;
import nu.studer.sample.pg_catalog.tables.PgProc;
import nu.studer.sample.pg_catalog.tables.PgPublication;
import nu.studer.sample.pg_catalog.tables.PgPublicationRel;
import nu.studer.sample.pg_catalog.tables.PgRange;
import nu.studer.sample.pg_catalog.tables.PgReplicationOrigin;
import nu.studer.sample.pg_catalog.tables.PgRewrite;
import nu.studer.sample.pg_catalog.tables.PgSeclabel;
import nu.studer.sample.pg_catalog.tables.PgSequence;
import nu.studer.sample.pg_catalog.tables.PgShdepend;
import nu.studer.sample.pg_catalog.tables.PgShdescription;
import nu.studer.sample.pg_catalog.tables.PgShseclabel;
import nu.studer.sample.pg_catalog.tables.PgStatistic;
import nu.studer.sample.pg_catalog.tables.PgStatisticExt;
import nu.studer.sample.pg_catalog.tables.PgStatisticExtData;
import nu.studer.sample.pg_catalog.tables.PgSubscription;
import nu.studer.sample.pg_catalog.tables.PgSubscriptionRel;
import nu.studer.sample.pg_catalog.tables.PgTablespace;
import nu.studer.sample.pg_catalog.tables.PgTransform;
import nu.studer.sample.pg_catalog.tables.PgTrigger;
import nu.studer.sample.pg_catalog.tables.PgTsConfig;
import nu.studer.sample.pg_catalog.tables.PgTsConfigMap;
import nu.studer.sample.pg_catalog.tables.PgTsDict;
import nu.studer.sample.pg_catalog.tables.PgTsParser;
import nu.studer.sample.pg_catalog.tables.PgTsTemplate;
import nu.studer.sample.pg_catalog.tables.PgType;
import nu.studer.sample.pg_catalog.tables.PgUserMapping;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in pg_catalog.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PG_AGGREGATE_FNOID_INDEX = Internal.createIndex(DSL.name("pg_aggregate_fnoid_index"), PgAggregate.PG_AGGREGATE, new OrderField[] { PgAggregate.PG_AGGREGATE.AGGFNOID }, true);
    public static final Index PG_AM_NAME_INDEX = Internal.createIndex(DSL.name("pg_am_name_index"), PgAm.PG_AM, new OrderField[] { PgAm.PG_AM.AMNAME }, true);
    public static final Index PG_AM_OID_INDEX = Internal.createIndex(DSL.name("pg_am_oid_index"), PgAm.PG_AM, new OrderField[] { PgAm.PG_AM.OID }, true);
    public static final Index PG_AMOP_FAM_STRAT_INDEX = Internal.createIndex(DSL.name("pg_amop_fam_strat_index"), PgAmop.PG_AMOP, new OrderField[] { PgAmop.PG_AMOP.AMOPFAMILY, PgAmop.PG_AMOP.AMOPLEFTTYPE, PgAmop.PG_AMOP.AMOPRIGHTTYPE, PgAmop.PG_AMOP.AMOPSTRATEGY }, true);
    public static final Index PG_AMOP_OID_INDEX = Internal.createIndex(DSL.name("pg_amop_oid_index"), PgAmop.PG_AMOP, new OrderField[] { PgAmop.PG_AMOP.OID }, true);
    public static final Index PG_AMOP_OPR_FAM_INDEX = Internal.createIndex(DSL.name("pg_amop_opr_fam_index"), PgAmop.PG_AMOP, new OrderField[] { PgAmop.PG_AMOP.AMOPOPR, PgAmop.PG_AMOP.AMOPPURPOSE, PgAmop.PG_AMOP.AMOPFAMILY }, true);
    public static final Index PG_AMPROC_FAM_PROC_INDEX = Internal.createIndex(DSL.name("pg_amproc_fam_proc_index"), PgAmproc.PG_AMPROC, new OrderField[] { PgAmproc.PG_AMPROC.AMPROCFAMILY, PgAmproc.PG_AMPROC.AMPROCLEFTTYPE, PgAmproc.PG_AMPROC.AMPROCRIGHTTYPE, PgAmproc.PG_AMPROC.AMPROCNUM }, true);
    public static final Index PG_AMPROC_OID_INDEX = Internal.createIndex(DSL.name("pg_amproc_oid_index"), PgAmproc.PG_AMPROC, new OrderField[] { PgAmproc.PG_AMPROC.OID }, true);
    public static final Index PG_ATTRDEF_ADRELID_ADNUM_INDEX = Internal.createIndex(DSL.name("pg_attrdef_adrelid_adnum_index"), PgAttrdef.PG_ATTRDEF, new OrderField[] { PgAttrdef.PG_ATTRDEF.ADRELID, PgAttrdef.PG_ATTRDEF.ADNUM }, true);
    public static final Index PG_ATTRDEF_OID_INDEX = Internal.createIndex(DSL.name("pg_attrdef_oid_index"), PgAttrdef.PG_ATTRDEF, new OrderField[] { PgAttrdef.PG_ATTRDEF.OID }, true);
    public static final Index PG_ATTRIBUTE_RELID_ATTNAM_INDEX = Internal.createIndex(DSL.name("pg_attribute_relid_attnam_index"), PgAttribute.PG_ATTRIBUTE, new OrderField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNAME }, true);
    public static final Index PG_ATTRIBUTE_RELID_ATTNUM_INDEX = Internal.createIndex(DSL.name("pg_attribute_relid_attnum_index"), PgAttribute.PG_ATTRIBUTE, new OrderField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNUM }, true);
    public static final Index PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX = Internal.createIndex(DSL.name("pg_auth_members_member_role_index"), PgAuthMembers.PG_AUTH_MEMBERS, new OrderField[] { PgAuthMembers.PG_AUTH_MEMBERS.MEMBER, PgAuthMembers.PG_AUTH_MEMBERS.ROLEID }, true);
    public static final Index PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX = Internal.createIndex(DSL.name("pg_auth_members_role_member_index"), PgAuthMembers.PG_AUTH_MEMBERS, new OrderField[] { PgAuthMembers.PG_AUTH_MEMBERS.ROLEID, PgAuthMembers.PG_AUTH_MEMBERS.MEMBER }, true);
    public static final Index PG_AUTHID_OID_INDEX = Internal.createIndex(DSL.name("pg_authid_oid_index"), PgAuthid.PG_AUTHID, new OrderField[] { PgAuthid.PG_AUTHID.OID }, true);
    public static final Index PG_AUTHID_ROLNAME_INDEX = Internal.createIndex(DSL.name("pg_authid_rolname_index"), PgAuthid.PG_AUTHID, new OrderField[] { PgAuthid.PG_AUTHID.ROLNAME }, true);
    public static final Index PG_CAST_OID_INDEX = Internal.createIndex(DSL.name("pg_cast_oid_index"), PgCast.PG_CAST, new OrderField[] { PgCast.PG_CAST.OID }, true);
    public static final Index PG_CAST_SOURCE_TARGET_INDEX = Internal.createIndex(DSL.name("pg_cast_source_target_index"), PgCast.PG_CAST, new OrderField[] { PgCast.PG_CAST.CASTSOURCE, PgCast.PG_CAST.CASTTARGET }, true);
    public static final Index PG_CLASS_OID_INDEX = Internal.createIndex(DSL.name("pg_class_oid_index"), PgClass.PG_CLASS, new OrderField[] { PgClass.PG_CLASS.OID }, true);
    public static final Index PG_CLASS_RELNAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_class_relname_nsp_index"), PgClass.PG_CLASS, new OrderField[] { PgClass.PG_CLASS.RELNAME, PgClass.PG_CLASS.RELNAMESPACE }, true);
    public static final Index PG_CLASS_TBLSPC_RELFILENODE_INDEX = Internal.createIndex(DSL.name("pg_class_tblspc_relfilenode_index"), PgClass.PG_CLASS, new OrderField[] { PgClass.PG_CLASS.RELTABLESPACE, PgClass.PG_CLASS.RELFILENODE }, false);
    public static final Index PG_COLLATION_NAME_ENC_NSP_INDEX = Internal.createIndex(DSL.name("pg_collation_name_enc_nsp_index"), PgCollation.PG_COLLATION, new OrderField[] { PgCollation.PG_COLLATION.COLLNAME, PgCollation.PG_COLLATION.COLLENCODING, PgCollation.PG_COLLATION.COLLNAMESPACE }, true);
    public static final Index PG_COLLATION_OID_INDEX = Internal.createIndex(DSL.name("pg_collation_oid_index"), PgCollation.PG_COLLATION, new OrderField[] { PgCollation.PG_COLLATION.OID }, true);
    public static final Index PG_CONSTRAINT_CONNAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_constraint_conname_nsp_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONNAME, PgConstraint.PG_CONSTRAINT.CONNAMESPACE }, false);
    public static final Index PG_CONSTRAINT_CONPARENTID_INDEX = Internal.createIndex(DSL.name("pg_constraint_conparentid_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONPARENTID }, false);
    public static final Index PG_CONSTRAINT_CONRELID_CONTYPID_CONNAME_INDEX = Internal.createIndex(DSL.name("pg_constraint_conrelid_contypid_conname_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONRELID, PgConstraint.PG_CONSTRAINT.CONTYPID, PgConstraint.PG_CONSTRAINT.CONNAME }, true);
    public static final Index PG_CONSTRAINT_CONTYPID_INDEX = Internal.createIndex(DSL.name("pg_constraint_contypid_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONTYPID }, false);
    public static final Index PG_CONSTRAINT_OID_INDEX = Internal.createIndex(DSL.name("pg_constraint_oid_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.OID }, true);
    public static final Index PG_CONVERSION_DEFAULT_INDEX = Internal.createIndex(DSL.name("pg_conversion_default_index"), PgConversion.PG_CONVERSION, new OrderField[] { PgConversion.PG_CONVERSION.CONNAMESPACE, PgConversion.PG_CONVERSION.CONFORENCODING, PgConversion.PG_CONVERSION.CONTOENCODING, PgConversion.PG_CONVERSION.OID }, true);
    public static final Index PG_CONVERSION_NAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_conversion_name_nsp_index"), PgConversion.PG_CONVERSION, new OrderField[] { PgConversion.PG_CONVERSION.CONNAME, PgConversion.PG_CONVERSION.CONNAMESPACE }, true);
    public static final Index PG_CONVERSION_OID_INDEX = Internal.createIndex(DSL.name("pg_conversion_oid_index"), PgConversion.PG_CONVERSION, new OrderField[] { PgConversion.PG_CONVERSION.OID }, true);
    public static final Index PG_DATABASE_DATNAME_INDEX = Internal.createIndex(DSL.name("pg_database_datname_index"), PgDatabase.PG_DATABASE, new OrderField[] { PgDatabase.PG_DATABASE.DATNAME }, true);
    public static final Index PG_DATABASE_OID_INDEX = Internal.createIndex(DSL.name("pg_database_oid_index"), PgDatabase.PG_DATABASE, new OrderField[] { PgDatabase.PG_DATABASE.OID }, true);
    public static final Index PG_DB_ROLE_SETTING_DATABASEID_ROL_INDEX = Internal.createIndex(DSL.name("pg_db_role_setting_databaseid_rol_index"), PgDbRoleSetting.PG_DB_ROLE_SETTING, new OrderField[] { PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE, PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE }, true);
    public static final Index PG_DEFAULT_ACL_OID_INDEX = Internal.createIndex(DSL.name("pg_default_acl_oid_index"), PgDefaultAcl.PG_DEFAULT_ACL, new OrderField[] { PgDefaultAcl.PG_DEFAULT_ACL.OID }, true);
    public static final Index PG_DEFAULT_ACL_ROLE_NSP_OBJ_INDEX = Internal.createIndex(DSL.name("pg_default_acl_role_nsp_obj_index"), PgDefaultAcl.PG_DEFAULT_ACL, new OrderField[] { PgDefaultAcl.PG_DEFAULT_ACL.DEFACLROLE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLNAMESPACE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLOBJTYPE }, true);
    public static final Index PG_DEPEND_DEPENDER_INDEX = Internal.createIndex(DSL.name("pg_depend_depender_index"), PgDepend.PG_DEPEND, new OrderField[] { PgDepend.PG_DEPEND.CLASSID, PgDepend.PG_DEPEND.OBJID, PgDepend.PG_DEPEND.OBJSUBID }, false);
    public static final Index PG_DEPEND_REFERENCE_INDEX = Internal.createIndex(DSL.name("pg_depend_reference_index"), PgDepend.PG_DEPEND, new OrderField[] { PgDepend.PG_DEPEND.REFCLASSID, PgDepend.PG_DEPEND.REFOBJID, PgDepend.PG_DEPEND.REFOBJSUBID }, false);
    public static final Index PG_DESCRIPTION_O_C_O_INDEX = Internal.createIndex(DSL.name("pg_description_o_c_o_index"), PgDescription.PG_DESCRIPTION, new OrderField[] { PgDescription.PG_DESCRIPTION.OBJOID, PgDescription.PG_DESCRIPTION.CLASSOID, PgDescription.PG_DESCRIPTION.OBJSUBID }, true);
    public static final Index PG_ENUM_OID_INDEX = Internal.createIndex(DSL.name("pg_enum_oid_index"), PgEnum.PG_ENUM, new OrderField[] { PgEnum.PG_ENUM.OID }, true);
    public static final Index PG_ENUM_TYPID_LABEL_INDEX = Internal.createIndex(DSL.name("pg_enum_typid_label_index"), PgEnum.PG_ENUM, new OrderField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMLABEL }, true);
    public static final Index PG_ENUM_TYPID_SORTORDER_INDEX = Internal.createIndex(DSL.name("pg_enum_typid_sortorder_index"), PgEnum.PG_ENUM, new OrderField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMSORTORDER }, true);
    public static final Index PG_EVENT_TRIGGER_EVTNAME_INDEX = Internal.createIndex(DSL.name("pg_event_trigger_evtname_index"), PgEventTrigger.PG_EVENT_TRIGGER, new OrderField[] { PgEventTrigger.PG_EVENT_TRIGGER.EVTNAME }, true);
    public static final Index PG_EVENT_TRIGGER_OID_INDEX = Internal.createIndex(DSL.name("pg_event_trigger_oid_index"), PgEventTrigger.PG_EVENT_TRIGGER, new OrderField[] { PgEventTrigger.PG_EVENT_TRIGGER.OID }, true);
    public static final Index PG_EXTENSION_NAME_INDEX = Internal.createIndex(DSL.name("pg_extension_name_index"), PgExtension.PG_EXTENSION, new OrderField[] { PgExtension.PG_EXTENSION.EXTNAME }, true);
    public static final Index PG_EXTENSION_OID_INDEX = Internal.createIndex(DSL.name("pg_extension_oid_index"), PgExtension.PG_EXTENSION, new OrderField[] { PgExtension.PG_EXTENSION.OID }, true);
    public static final Index PG_FOREIGN_DATA_WRAPPER_NAME_INDEX = Internal.createIndex(DSL.name("pg_foreign_data_wrapper_name_index"), PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, new OrderField[] { PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWNAME }, true);
    public static final Index PG_FOREIGN_DATA_WRAPPER_OID_INDEX = Internal.createIndex(DSL.name("pg_foreign_data_wrapper_oid_index"), PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, new OrderField[] { PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.OID }, true);
    public static final Index PG_FOREIGN_SERVER_NAME_INDEX = Internal.createIndex(DSL.name("pg_foreign_server_name_index"), PgForeignServer.PG_FOREIGN_SERVER, new OrderField[] { PgForeignServer.PG_FOREIGN_SERVER.SRVNAME }, true);
    public static final Index PG_FOREIGN_SERVER_OID_INDEX = Internal.createIndex(DSL.name("pg_foreign_server_oid_index"), PgForeignServer.PG_FOREIGN_SERVER, new OrderField[] { PgForeignServer.PG_FOREIGN_SERVER.OID }, true);
    public static final Index PG_FOREIGN_TABLE_RELID_INDEX = Internal.createIndex(DSL.name("pg_foreign_table_relid_index"), PgForeignTable.PG_FOREIGN_TABLE, new OrderField[] { PgForeignTable.PG_FOREIGN_TABLE.FTRELID }, true);
    public static final Index PG_INDEX_INDEXRELID_INDEX = Internal.createIndex(DSL.name("pg_index_indexrelid_index"), PgIndex.PG_INDEX, new OrderField[] { PgIndex.PG_INDEX.INDEXRELID }, true);
    public static final Index PG_INDEX_INDRELID_INDEX = Internal.createIndex(DSL.name("pg_index_indrelid_index"), PgIndex.PG_INDEX, new OrderField[] { PgIndex.PG_INDEX.INDRELID }, false);
    public static final Index PG_INHERITS_PARENT_INDEX = Internal.createIndex(DSL.name("pg_inherits_parent_index"), PgInherits.PG_INHERITS, new OrderField[] { PgInherits.PG_INHERITS.INHPARENT }, false);
    public static final Index PG_INHERITS_RELID_SEQNO_INDEX = Internal.createIndex(DSL.name("pg_inherits_relid_seqno_index"), PgInherits.PG_INHERITS, new OrderField[] { PgInherits.PG_INHERITS.INHRELID, PgInherits.PG_INHERITS.INHSEQNO }, true);
    public static final Index PG_INIT_PRIVS_O_C_O_INDEX = Internal.createIndex(DSL.name("pg_init_privs_o_c_o_index"), PgInitPrivs.PG_INIT_PRIVS, new OrderField[] { PgInitPrivs.PG_INIT_PRIVS.OBJOID, PgInitPrivs.PG_INIT_PRIVS.CLASSOID, PgInitPrivs.PG_INIT_PRIVS.OBJSUBID }, true);
    public static final Index PG_LANGUAGE_NAME_INDEX = Internal.createIndex(DSL.name("pg_language_name_index"), PgLanguage.PG_LANGUAGE, new OrderField[] { PgLanguage.PG_LANGUAGE.LANNAME }, true);
    public static final Index PG_LANGUAGE_OID_INDEX = Internal.createIndex(DSL.name("pg_language_oid_index"), PgLanguage.PG_LANGUAGE, new OrderField[] { PgLanguage.PG_LANGUAGE.OID }, true);
    public static final Index PG_LARGEOBJECT_LOID_PN_INDEX = Internal.createIndex(DSL.name("pg_largeobject_loid_pn_index"), PgLargeobject.PG_LARGEOBJECT, new OrderField[] { PgLargeobject.PG_LARGEOBJECT.LOID, PgLargeobject.PG_LARGEOBJECT.PAGENO }, true);
    public static final Index PG_LARGEOBJECT_METADATA_OID_INDEX = Internal.createIndex(DSL.name("pg_largeobject_metadata_oid_index"), PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA, new OrderField[] { PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.OID }, true);
    public static final Index PG_NAMESPACE_NSPNAME_INDEX = Internal.createIndex(DSL.name("pg_namespace_nspname_index"), PgNamespace.PG_NAMESPACE, new OrderField[] { PgNamespace.PG_NAMESPACE.NSPNAME }, true);
    public static final Index PG_NAMESPACE_OID_INDEX = Internal.createIndex(DSL.name("pg_namespace_oid_index"), PgNamespace.PG_NAMESPACE, new OrderField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final Index PG_OPCLASS_AM_NAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_opclass_am_name_nsp_index"), PgOpclass.PG_OPCLASS, new OrderField[] { PgOpclass.PG_OPCLASS.OPCMETHOD, PgOpclass.PG_OPCLASS.OPCNAME, PgOpclass.PG_OPCLASS.OPCNAMESPACE }, true);
    public static final Index PG_OPCLASS_OID_INDEX = Internal.createIndex(DSL.name("pg_opclass_oid_index"), PgOpclass.PG_OPCLASS, new OrderField[] { PgOpclass.PG_OPCLASS.OID }, true);
    public static final Index PG_OPERATOR_OID_INDEX = Internal.createIndex(DSL.name("pg_operator_oid_index"), PgOperator.PG_OPERATOR, new OrderField[] { PgOperator.PG_OPERATOR.OID }, true);
    public static final Index PG_OPERATOR_OPRNAME_L_R_N_INDEX = Internal.createIndex(DSL.name("pg_operator_oprname_l_r_n_index"), PgOperator.PG_OPERATOR, new OrderField[] { PgOperator.PG_OPERATOR.OPRNAME, PgOperator.PG_OPERATOR.OPRLEFT, PgOperator.PG_OPERATOR.OPRRIGHT, PgOperator.PG_OPERATOR.OPRNAMESPACE }, true);
    public static final Index PG_OPFAMILY_AM_NAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_opfamily_am_name_nsp_index"), PgOpfamily.PG_OPFAMILY, new OrderField[] { PgOpfamily.PG_OPFAMILY.OPFMETHOD, PgOpfamily.PG_OPFAMILY.OPFNAME, PgOpfamily.PG_OPFAMILY.OPFNAMESPACE }, true);
    public static final Index PG_OPFAMILY_OID_INDEX = Internal.createIndex(DSL.name("pg_opfamily_oid_index"), PgOpfamily.PG_OPFAMILY, new OrderField[] { PgOpfamily.PG_OPFAMILY.OID }, true);
    public static final Index PG_PARTITIONED_TABLE_PARTRELID_INDEX = Internal.createIndex(DSL.name("pg_partitioned_table_partrelid_index"), PgPartitionedTable.PG_PARTITIONED_TABLE, new OrderField[] { PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID }, true);
    public static final Index PG_POLICY_OID_INDEX = Internal.createIndex(DSL.name("pg_policy_oid_index"), PgPolicy.PG_POLICY, new OrderField[] { PgPolicy.PG_POLICY.OID }, true);
    public static final Index PG_POLICY_POLRELID_POLNAME_INDEX = Internal.createIndex(DSL.name("pg_policy_polrelid_polname_index"), PgPolicy.PG_POLICY, new OrderField[] { PgPolicy.PG_POLICY.POLRELID, PgPolicy.PG_POLICY.POLNAME }, true);
    public static final Index PG_PROC_OID_INDEX = Internal.createIndex(DSL.name("pg_proc_oid_index"), PgProc.PG_PROC, new OrderField[] { PgProc.PG_PROC.OID }, true);
    public static final Index PG_PROC_PRONAME_ARGS_NSP_INDEX = Internal.createIndex(DSL.name("pg_proc_proname_args_nsp_index"), PgProc.PG_PROC, new OrderField[] { PgProc.PG_PROC.PRONAME, PgProc.PG_PROC.PROARGTYPES, PgProc.PG_PROC.PRONAMESPACE }, true);
    public static final Index PG_PUBLICATION_OID_INDEX = Internal.createIndex(DSL.name("pg_publication_oid_index"), PgPublication.PG_PUBLICATION, new OrderField[] { PgPublication.PG_PUBLICATION.OID }, true);
    public static final Index PG_PUBLICATION_PUBNAME_INDEX = Internal.createIndex(DSL.name("pg_publication_pubname_index"), PgPublication.PG_PUBLICATION, new OrderField[] { PgPublication.PG_PUBLICATION.PUBNAME }, true);
    public static final Index PG_PUBLICATION_REL_OID_INDEX = Internal.createIndex(DSL.name("pg_publication_rel_oid_index"), PgPublicationRel.PG_PUBLICATION_REL, new OrderField[] { PgPublicationRel.PG_PUBLICATION_REL.OID }, true);
    public static final Index PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX = Internal.createIndex(DSL.name("pg_publication_rel_prrelid_prpubid_index"), PgPublicationRel.PG_PUBLICATION_REL, new OrderField[] { PgPublicationRel.PG_PUBLICATION_REL.PRRELID, PgPublicationRel.PG_PUBLICATION_REL.PRPUBID }, true);
    public static final Index PG_RANGE_RNGTYPID_INDEX = Internal.createIndex(DSL.name("pg_range_rngtypid_index"), PgRange.PG_RANGE, new OrderField[] { PgRange.PG_RANGE.RNGTYPID }, true);
    public static final Index PG_REPLICATION_ORIGIN_ROIIDENT_INDEX = Internal.createIndex(DSL.name("pg_replication_origin_roiident_index"), PgReplicationOrigin.PG_REPLICATION_ORIGIN, new OrderField[] { PgReplicationOrigin.PG_REPLICATION_ORIGIN.ROIDENT }, true);
    public static final Index PG_REPLICATION_ORIGIN_RONAME_INDEX = Internal.createIndex(DSL.name("pg_replication_origin_roname_index"), PgReplicationOrigin.PG_REPLICATION_ORIGIN, new OrderField[] { PgReplicationOrigin.PG_REPLICATION_ORIGIN.RONAME }, true);
    public static final Index PG_REWRITE_OID_INDEX = Internal.createIndex(DSL.name("pg_rewrite_oid_index"), PgRewrite.PG_REWRITE, new OrderField[] { PgRewrite.PG_REWRITE.OID }, true);
    public static final Index PG_REWRITE_REL_RULENAME_INDEX = Internal.createIndex(DSL.name("pg_rewrite_rel_rulename_index"), PgRewrite.PG_REWRITE, new OrderField[] { PgRewrite.PG_REWRITE.EV_CLASS, PgRewrite.PG_REWRITE.RULENAME }, true);
    public static final Index PG_SECLABEL_OBJECT_INDEX = Internal.createIndex(DSL.name("pg_seclabel_object_index"), PgSeclabel.PG_SECLABEL, new OrderField[] { PgSeclabel.PG_SECLABEL.OBJOID, PgSeclabel.PG_SECLABEL.CLASSOID, PgSeclabel.PG_SECLABEL.OBJSUBID, PgSeclabel.PG_SECLABEL.PROVIDER }, true);
    public static final Index PG_SEQUENCE_SEQRELID_INDEX = Internal.createIndex(DSL.name("pg_sequence_seqrelid_index"), PgSequence.PG_SEQUENCE, new OrderField[] { PgSequence.PG_SEQUENCE.SEQRELID }, true);
    public static final Index PG_SHDEPEND_DEPENDER_INDEX = Internal.createIndex(DSL.name("pg_shdepend_depender_index"), PgShdepend.PG_SHDEPEND, new OrderField[] { PgShdepend.PG_SHDEPEND.DBID, PgShdepend.PG_SHDEPEND.CLASSID, PgShdepend.PG_SHDEPEND.OBJID, PgShdepend.PG_SHDEPEND.OBJSUBID }, false);
    public static final Index PG_SHDEPEND_REFERENCE_INDEX = Internal.createIndex(DSL.name("pg_shdepend_reference_index"), PgShdepend.PG_SHDEPEND, new OrderField[] { PgShdepend.PG_SHDEPEND.REFCLASSID, PgShdepend.PG_SHDEPEND.REFOBJID }, false);
    public static final Index PG_SHDESCRIPTION_O_C_INDEX = Internal.createIndex(DSL.name("pg_shdescription_o_c_index"), PgShdescription.PG_SHDESCRIPTION, new OrderField[] { PgShdescription.PG_SHDESCRIPTION.OBJOID, PgShdescription.PG_SHDESCRIPTION.CLASSOID }, true);
    public static final Index PG_SHSECLABEL_OBJECT_INDEX = Internal.createIndex(DSL.name("pg_shseclabel_object_index"), PgShseclabel.PG_SHSECLABEL, new OrderField[] { PgShseclabel.PG_SHSECLABEL.OBJOID, PgShseclabel.PG_SHSECLABEL.CLASSOID, PgShseclabel.PG_SHSECLABEL.PROVIDER }, true);
    public static final Index PG_STATISTIC_EXT_DATA_STXOID_INDEX = Internal.createIndex(DSL.name("pg_statistic_ext_data_stxoid_index"), PgStatisticExtData.PG_STATISTIC_EXT_DATA, new OrderField[] { PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXOID }, true);
    public static final Index PG_STATISTIC_EXT_NAME_INDEX = Internal.createIndex(DSL.name("pg_statistic_ext_name_index"), PgStatisticExt.PG_STATISTIC_EXT, new OrderField[] { PgStatisticExt.PG_STATISTIC_EXT.STXNAME, PgStatisticExt.PG_STATISTIC_EXT.STXNAMESPACE }, true);
    public static final Index PG_STATISTIC_EXT_OID_INDEX = Internal.createIndex(DSL.name("pg_statistic_ext_oid_index"), PgStatisticExt.PG_STATISTIC_EXT, new OrderField[] { PgStatisticExt.PG_STATISTIC_EXT.OID }, true);
    public static final Index PG_STATISTIC_EXT_RELID_INDEX = Internal.createIndex(DSL.name("pg_statistic_ext_relid_index"), PgStatisticExt.PG_STATISTIC_EXT, new OrderField[] { PgStatisticExt.PG_STATISTIC_EXT.STXRELID }, false);
    public static final Index PG_STATISTIC_RELID_ATT_INH_INDEX = Internal.createIndex(DSL.name("pg_statistic_relid_att_inh_index"), PgStatistic.PG_STATISTIC, new OrderField[] { PgStatistic.PG_STATISTIC.STARELID, PgStatistic.PG_STATISTIC.STAATTNUM, PgStatistic.PG_STATISTIC.STAINHERIT }, true);
    public static final Index PG_SUBSCRIPTION_OID_INDEX = Internal.createIndex(DSL.name("pg_subscription_oid_index"), PgSubscription.PG_SUBSCRIPTION, new OrderField[] { PgSubscription.PG_SUBSCRIPTION.OID }, true);
    public static final Index PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX = Internal.createIndex(DSL.name("pg_subscription_rel_srrelid_srsubid_index"), PgSubscriptionRel.PG_SUBSCRIPTION_REL, new OrderField[] { PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRRELID, PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBID }, true);
    public static final Index PG_SUBSCRIPTION_SUBNAME_INDEX = Internal.createIndex(DSL.name("pg_subscription_subname_index"), PgSubscription.PG_SUBSCRIPTION, new OrderField[] { PgSubscription.PG_SUBSCRIPTION.SUBDBID, PgSubscription.PG_SUBSCRIPTION.SUBNAME }, true);
    public static final Index PG_TABLESPACE_OID_INDEX = Internal.createIndex(DSL.name("pg_tablespace_oid_index"), PgTablespace.PG_TABLESPACE, new OrderField[] { PgTablespace.PG_TABLESPACE.OID }, true);
    public static final Index PG_TABLESPACE_SPCNAME_INDEX = Internal.createIndex(DSL.name("pg_tablespace_spcname_index"), PgTablespace.PG_TABLESPACE, new OrderField[] { PgTablespace.PG_TABLESPACE.SPCNAME }, true);
    public static final Index PG_TRANSFORM_OID_INDEX = Internal.createIndex(DSL.name("pg_transform_oid_index"), PgTransform.PG_TRANSFORM, new OrderField[] { PgTransform.PG_TRANSFORM.OID }, true);
    public static final Index PG_TRANSFORM_TYPE_LANG_INDEX = Internal.createIndex(DSL.name("pg_transform_type_lang_index"), PgTransform.PG_TRANSFORM, new OrderField[] { PgTransform.PG_TRANSFORM.TRFTYPE, PgTransform.PG_TRANSFORM.TRFLANG }, true);
    public static final Index PG_TRIGGER_OID_INDEX = Internal.createIndex(DSL.name("pg_trigger_oid_index"), PgTrigger.PG_TRIGGER, new OrderField[] { PgTrigger.PG_TRIGGER.OID }, true);
    public static final Index PG_TRIGGER_TGCONSTRAINT_INDEX = Internal.createIndex(DSL.name("pg_trigger_tgconstraint_index"), PgTrigger.PG_TRIGGER, new OrderField[] { PgTrigger.PG_TRIGGER.TGCONSTRAINT }, false);
    public static final Index PG_TRIGGER_TGRELID_TGNAME_INDEX = Internal.createIndex(DSL.name("pg_trigger_tgrelid_tgname_index"), PgTrigger.PG_TRIGGER, new OrderField[] { PgTrigger.PG_TRIGGER.TGRELID, PgTrigger.PG_TRIGGER.TGNAME }, true);
    public static final Index PG_TS_CONFIG_CFGNAME_INDEX = Internal.createIndex(DSL.name("pg_ts_config_cfgname_index"), PgTsConfig.PG_TS_CONFIG, new OrderField[] { PgTsConfig.PG_TS_CONFIG.CFGNAME, PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE }, true);
    public static final Index PG_TS_CONFIG_MAP_INDEX = Internal.createIndex(DSL.name("pg_ts_config_map_index"), PgTsConfigMap.PG_TS_CONFIG_MAP, new OrderField[] { PgTsConfigMap.PG_TS_CONFIG_MAP.MAPCFG, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPTOKENTYPE, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPSEQNO }, true);
    public static final Index PG_TS_CONFIG_OID_INDEX = Internal.createIndex(DSL.name("pg_ts_config_oid_index"), PgTsConfig.PG_TS_CONFIG, new OrderField[] { PgTsConfig.PG_TS_CONFIG.OID }, true);
    public static final Index PG_TS_DICT_DICTNAME_INDEX = Internal.createIndex(DSL.name("pg_ts_dict_dictname_index"), PgTsDict.PG_TS_DICT, new OrderField[] { PgTsDict.PG_TS_DICT.DICTNAME, PgTsDict.PG_TS_DICT.DICTNAMESPACE }, true);
    public static final Index PG_TS_DICT_OID_INDEX = Internal.createIndex(DSL.name("pg_ts_dict_oid_index"), PgTsDict.PG_TS_DICT, new OrderField[] { PgTsDict.PG_TS_DICT.OID }, true);
    public static final Index PG_TS_PARSER_OID_INDEX = Internal.createIndex(DSL.name("pg_ts_parser_oid_index"), PgTsParser.PG_TS_PARSER, new OrderField[] { PgTsParser.PG_TS_PARSER.OID }, true);
    public static final Index PG_TS_PARSER_PRSNAME_INDEX = Internal.createIndex(DSL.name("pg_ts_parser_prsname_index"), PgTsParser.PG_TS_PARSER, new OrderField[] { PgTsParser.PG_TS_PARSER.PRSNAME, PgTsParser.PG_TS_PARSER.PRSNAMESPACE }, true);
    public static final Index PG_TS_TEMPLATE_OID_INDEX = Internal.createIndex(DSL.name("pg_ts_template_oid_index"), PgTsTemplate.PG_TS_TEMPLATE, new OrderField[] { PgTsTemplate.PG_TS_TEMPLATE.OID }, true);
    public static final Index PG_TS_TEMPLATE_TMPLNAME_INDEX = Internal.createIndex(DSL.name("pg_ts_template_tmplname_index"), PgTsTemplate.PG_TS_TEMPLATE, new OrderField[] { PgTsTemplate.PG_TS_TEMPLATE.TMPLNAME, PgTsTemplate.PG_TS_TEMPLATE.TMPLNAMESPACE }, true);
    public static final Index PG_TYPE_OID_INDEX = Internal.createIndex(DSL.name("pg_type_oid_index"), PgType.PG_TYPE, new OrderField[] { PgType.PG_TYPE.OID }, true);
    public static final Index PG_TYPE_TYPNAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_type_typname_nsp_index"), PgType.PG_TYPE, new OrderField[] { PgType.PG_TYPE.TYPNAME, PgType.PG_TYPE.TYPNAMESPACE }, true);
    public static final Index PG_USER_MAPPING_OID_INDEX = Internal.createIndex(DSL.name("pg_user_mapping_oid_index"), PgUserMapping.PG_USER_MAPPING, new OrderField[] { PgUserMapping.PG_USER_MAPPING.OID }, true);
    public static final Index PG_USER_MAPPING_USER_SERVER_INDEX = Internal.createIndex(DSL.name("pg_user_mapping_user_server_index"), PgUserMapping.PG_USER_MAPPING, new OrderField[] { PgUserMapping.PG_USER_MAPPING.UMUSER, PgUserMapping.PG_USER_MAPPING.UMSERVER }, true);
}