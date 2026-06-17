package com.trizo1104.wms.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: wms/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WmsServiceGrpc {

  private WmsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "wms.WmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateProductRequest,
      com.trizo1104.wms.proto.ProductResponse> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = com.trizo1104.wms.proto.CreateProductRequest.class,
      responseType = com.trizo1104.wms.proto.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateProductRequest,
      com.trizo1104.wms.proto.ProductResponse> getCreateProductMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateProductRequest, com.trizo1104.wms.proto.ProductResponse> getCreateProductMethod;
    if ((getCreateProductMethod = WmsServiceGrpc.getCreateProductMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getCreateProductMethod = WmsServiceGrpc.getCreateProductMethod) == null) {
          WmsServiceGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.CreateProductRequest, com.trizo1104.wms.proto.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.CreateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("CreateProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductByIdRequest,
      com.trizo1104.wms.proto.ProductResponse> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = com.trizo1104.wms.proto.GetProductByIdRequest.class,
      responseType = com.trizo1104.wms.proto.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductByIdRequest,
      com.trizo1104.wms.proto.ProductResponse> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductByIdRequest, com.trizo1104.wms.proto.ProductResponse> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = WmsServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getGetProductByIdMethod = WmsServiceGrpc.getGetProductByIdMethod) == null) {
          WmsServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.GetProductByIdRequest, com.trizo1104.wms.proto.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("GetProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductBySkuRequest,
      com.trizo1104.wms.proto.ProductResponse> getGetProductBySkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductBySku",
      requestType = com.trizo1104.wms.proto.GetProductBySkuRequest.class,
      responseType = com.trizo1104.wms.proto.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductBySkuRequest,
      com.trizo1104.wms.proto.ProductResponse> getGetProductBySkuMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetProductBySkuRequest, com.trizo1104.wms.proto.ProductResponse> getGetProductBySkuMethod;
    if ((getGetProductBySkuMethod = WmsServiceGrpc.getGetProductBySkuMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getGetProductBySkuMethod = WmsServiceGrpc.getGetProductBySkuMethod) == null) {
          WmsServiceGrpc.getGetProductBySkuMethod = getGetProductBySkuMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.GetProductBySkuRequest, com.trizo1104.wms.proto.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductBySku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.GetProductBySkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("GetProductBySku"))
              .build();
        }
      }
    }
    return getGetProductBySkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateProductRequest,
      com.trizo1104.wms.proto.ProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.trizo1104.wms.proto.UpdateProductRequest.class,
      responseType = com.trizo1104.wms.proto.ProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateProductRequest,
      com.trizo1104.wms.proto.ProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateProductRequest, com.trizo1104.wms.proto.ProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = WmsServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getUpdateProductMethod = WmsServiceGrpc.getUpdateProductMethod) == null) {
          WmsServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.UpdateProductRequest, com.trizo1104.wms.proto.ProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteProductRequest,
      com.trizo1104.wms.proto.DeleteProductResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.trizo1104.wms.proto.DeleteProductRequest.class,
      responseType = com.trizo1104.wms.proto.DeleteProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteProductRequest,
      com.trizo1104.wms.proto.DeleteProductResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteProductRequest, com.trizo1104.wms.proto.DeleteProductResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = WmsServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getDeleteProductMethod = WmsServiceGrpc.getDeleteProductMethod) == null) {
          WmsServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.DeleteProductRequest, com.trizo1104.wms.proto.DeleteProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.DeleteProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("DeleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListProductsRequest,
      com.trizo1104.wms.proto.ListProductsResponse> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = com.trizo1104.wms.proto.ListProductsRequest.class,
      responseType = com.trizo1104.wms.proto.ListProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListProductsRequest,
      com.trizo1104.wms.proto.ListProductsResponse> getListProductsMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListProductsRequest, com.trizo1104.wms.proto.ListProductsResponse> getListProductsMethod;
    if ((getListProductsMethod = WmsServiceGrpc.getListProductsMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getListProductsMethod = WmsServiceGrpc.getListProductsMethod) == null) {
          WmsServiceGrpc.getListProductsMethod = getListProductsMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.ListProductsRequest, com.trizo1104.wms.proto.ListProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("ListProducts"))
              .build();
        }
      }
    }
    return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateWarehouseRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getCreateWarehouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWarehouse",
      requestType = com.trizo1104.wms.proto.CreateWarehouseRequest.class,
      responseType = com.trizo1104.wms.proto.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateWarehouseRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getCreateWarehouseMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.CreateWarehouseRequest, com.trizo1104.wms.proto.WarehouseResponse> getCreateWarehouseMethod;
    if ((getCreateWarehouseMethod = WmsServiceGrpc.getCreateWarehouseMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getCreateWarehouseMethod = WmsServiceGrpc.getCreateWarehouseMethod) == null) {
          WmsServiceGrpc.getCreateWarehouseMethod = getCreateWarehouseMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.CreateWarehouseRequest, com.trizo1104.wms.proto.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWarehouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.CreateWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("CreateWarehouse"))
              .build();
        }
      }
    }
    return getCreateWarehouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByIdRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWarehouseById",
      requestType = com.trizo1104.wms.proto.GetWarehouseByIdRequest.class,
      responseType = com.trizo1104.wms.proto.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByIdRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByIdMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByIdRequest, com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByIdMethod;
    if ((getGetWarehouseByIdMethod = WmsServiceGrpc.getGetWarehouseByIdMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getGetWarehouseByIdMethod = WmsServiceGrpc.getGetWarehouseByIdMethod) == null) {
          WmsServiceGrpc.getGetWarehouseByIdMethod = getGetWarehouseByIdMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.GetWarehouseByIdRequest, com.trizo1104.wms.proto.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWarehouseById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.GetWarehouseByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("GetWarehouseById"))
              .build();
        }
      }
    }
    return getGetWarehouseByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByCodeRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWarehouseByCode",
      requestType = com.trizo1104.wms.proto.GetWarehouseByCodeRequest.class,
      responseType = com.trizo1104.wms.proto.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByCodeRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByCodeMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetWarehouseByCodeRequest, com.trizo1104.wms.proto.WarehouseResponse> getGetWarehouseByCodeMethod;
    if ((getGetWarehouseByCodeMethod = WmsServiceGrpc.getGetWarehouseByCodeMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getGetWarehouseByCodeMethod = WmsServiceGrpc.getGetWarehouseByCodeMethod) == null) {
          WmsServiceGrpc.getGetWarehouseByCodeMethod = getGetWarehouseByCodeMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.GetWarehouseByCodeRequest, com.trizo1104.wms.proto.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWarehouseByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.GetWarehouseByCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("GetWarehouseByCode"))
              .build();
        }
      }
    }
    return getGetWarehouseByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateWarehouseRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getUpdateWarehouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWarehouse",
      requestType = com.trizo1104.wms.proto.UpdateWarehouseRequest.class,
      responseType = com.trizo1104.wms.proto.WarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateWarehouseRequest,
      com.trizo1104.wms.proto.WarehouseResponse> getUpdateWarehouseMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.UpdateWarehouseRequest, com.trizo1104.wms.proto.WarehouseResponse> getUpdateWarehouseMethod;
    if ((getUpdateWarehouseMethod = WmsServiceGrpc.getUpdateWarehouseMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getUpdateWarehouseMethod = WmsServiceGrpc.getUpdateWarehouseMethod) == null) {
          WmsServiceGrpc.getUpdateWarehouseMethod = getUpdateWarehouseMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.UpdateWarehouseRequest, com.trizo1104.wms.proto.WarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWarehouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.UpdateWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.WarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("UpdateWarehouse"))
              .build();
        }
      }
    }
    return getUpdateWarehouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteWarehouseRequest,
      com.trizo1104.wms.proto.DeleteWarehouseResponse> getDeleteWarehouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWarehouse",
      requestType = com.trizo1104.wms.proto.DeleteWarehouseRequest.class,
      responseType = com.trizo1104.wms.proto.DeleteWarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteWarehouseRequest,
      com.trizo1104.wms.proto.DeleteWarehouseResponse> getDeleteWarehouseMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.DeleteWarehouseRequest, com.trizo1104.wms.proto.DeleteWarehouseResponse> getDeleteWarehouseMethod;
    if ((getDeleteWarehouseMethod = WmsServiceGrpc.getDeleteWarehouseMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getDeleteWarehouseMethod = WmsServiceGrpc.getDeleteWarehouseMethod) == null) {
          WmsServiceGrpc.getDeleteWarehouseMethod = getDeleteWarehouseMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.DeleteWarehouseRequest, com.trizo1104.wms.proto.DeleteWarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWarehouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.DeleteWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.DeleteWarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("DeleteWarehouse"))
              .build();
        }
      }
    }
    return getDeleteWarehouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListWarehousesRequest,
      com.trizo1104.wms.proto.ListWarehousesResponse> getListWarehousesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWarehouses",
      requestType = com.trizo1104.wms.proto.ListWarehousesRequest.class,
      responseType = com.trizo1104.wms.proto.ListWarehousesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListWarehousesRequest,
      com.trizo1104.wms.proto.ListWarehousesResponse> getListWarehousesMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListWarehousesRequest, com.trizo1104.wms.proto.ListWarehousesResponse> getListWarehousesMethod;
    if ((getListWarehousesMethod = WmsServiceGrpc.getListWarehousesMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getListWarehousesMethod = WmsServiceGrpc.getListWarehousesMethod) == null) {
          WmsServiceGrpc.getListWarehousesMethod = getListWarehousesMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.ListWarehousesRequest, com.trizo1104.wms.proto.ListWarehousesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWarehouses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListWarehousesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListWarehousesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("ListWarehouses"))
              .build();
        }
      }
    }
    return getListWarehousesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetInventoryRequest,
      com.trizo1104.wms.proto.InventoryResponse> getGetInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInventory",
      requestType = com.trizo1104.wms.proto.GetInventoryRequest.class,
      responseType = com.trizo1104.wms.proto.InventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetInventoryRequest,
      com.trizo1104.wms.proto.InventoryResponse> getGetInventoryMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.GetInventoryRequest, com.trizo1104.wms.proto.InventoryResponse> getGetInventoryMethod;
    if ((getGetInventoryMethod = WmsServiceGrpc.getGetInventoryMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getGetInventoryMethod = WmsServiceGrpc.getGetInventoryMethod) == null) {
          WmsServiceGrpc.getGetInventoryMethod = getGetInventoryMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.GetInventoryRequest, com.trizo1104.wms.proto.InventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.GetInventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.InventoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("GetInventory"))
              .build();
        }
      }
    }
    return getGetInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInventories",
      requestType = com.trizo1104.wms.proto.ListInventoriesRequest.class,
      responseType = com.trizo1104.wms.proto.ListInventoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesRequest, com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesMethod;
    if ((getListInventoriesMethod = WmsServiceGrpc.getListInventoriesMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getListInventoriesMethod = WmsServiceGrpc.getListInventoriesMethod) == null) {
          WmsServiceGrpc.getListInventoriesMethod = getListInventoriesMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.ListInventoriesRequest, com.trizo1104.wms.proto.ListInventoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInventories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("ListInventories"))
              .build();
        }
      }
    }
    return getListInventoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByWarehouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInventoriesByWarehouse",
      requestType = com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest.class,
      responseType = com.trizo1104.wms.proto.ListInventoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByWarehouseMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest, com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByWarehouseMethod;
    if ((getListInventoriesByWarehouseMethod = WmsServiceGrpc.getListInventoriesByWarehouseMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getListInventoriesByWarehouseMethod = WmsServiceGrpc.getListInventoriesByWarehouseMethod) == null) {
          WmsServiceGrpc.getListInventoriesByWarehouseMethod = getListInventoriesByWarehouseMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest, com.trizo1104.wms.proto.ListInventoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInventoriesByWarehouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("ListInventoriesByWarehouse"))
              .build();
        }
      }
    }
    return getListInventoriesByWarehouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByProductRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInventoriesByProduct",
      requestType = com.trizo1104.wms.proto.ListInventoriesByProductRequest.class,
      responseType = com.trizo1104.wms.proto.ListInventoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByProductRequest,
      com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByProductMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.wms.proto.ListInventoriesByProductRequest, com.trizo1104.wms.proto.ListInventoriesResponse> getListInventoriesByProductMethod;
    if ((getListInventoriesByProductMethod = WmsServiceGrpc.getListInventoriesByProductMethod) == null) {
      synchronized (WmsServiceGrpc.class) {
        if ((getListInventoriesByProductMethod = WmsServiceGrpc.getListInventoriesByProductMethod) == null) {
          WmsServiceGrpc.getListInventoriesByProductMethod = getListInventoriesByProductMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.wms.proto.ListInventoriesByProductRequest, com.trizo1104.wms.proto.ListInventoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInventoriesByProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesByProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.wms.proto.ListInventoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WmsServiceMethodDescriptorSupplier("ListInventoriesByProduct"))
              .build();
        }
      }
    }
    return getListInventoriesByProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WmsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WmsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WmsServiceStub>() {
        @java.lang.Override
        public WmsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WmsServiceStub(channel, callOptions);
        }
      };
    return WmsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WmsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WmsServiceBlockingStub>() {
        @java.lang.Override
        public WmsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WmsServiceBlockingStub(channel, callOptions);
        }
      };
    return WmsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WmsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WmsServiceFutureStub>() {
        @java.lang.Override
        public WmsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WmsServiceFutureStub(channel, callOptions);
        }
      };
    return WmsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createProduct(com.trizo1104.wms.proto.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    default void getProductById(com.trizo1104.wms.proto.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    default void getProductBySku(com.trizo1104.wms.proto.GetProductBySkuRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductBySkuMethod(), responseObserver);
    }

    /**
     */
    default void updateProduct(com.trizo1104.wms.proto.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    default void deleteProduct(com.trizo1104.wms.proto.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    /**
     */
    default void listProducts(com.trizo1104.wms.proto.ListProductsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     */
    default void createWarehouse(com.trizo1104.wms.proto.CreateWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWarehouseMethod(), responseObserver);
    }

    /**
     */
    default void getWarehouseById(com.trizo1104.wms.proto.GetWarehouseByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWarehouseByIdMethod(), responseObserver);
    }

    /**
     */
    default void getWarehouseByCode(com.trizo1104.wms.proto.GetWarehouseByCodeRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWarehouseByCodeMethod(), responseObserver);
    }

    /**
     */
    default void updateWarehouse(com.trizo1104.wms.proto.UpdateWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWarehouseMethod(), responseObserver);
    }

    /**
     */
    default void deleteWarehouse(com.trizo1104.wms.proto.DeleteWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteWarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWarehouseMethod(), responseObserver);
    }

    /**
     */
    default void listWarehouses(com.trizo1104.wms.proto.ListWarehousesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListWarehousesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWarehousesMethod(), responseObserver);
    }

    /**
     */
    default void getInventory(com.trizo1104.wms.proto.GetInventoryRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.InventoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInventoryMethod(), responseObserver);
    }

    /**
     */
    default void listInventories(com.trizo1104.wms.proto.ListInventoriesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInventoriesMethod(), responseObserver);
    }

    /**
     */
    default void listInventoriesByWarehouse(com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInventoriesByWarehouseMethod(), responseObserver);
    }

    /**
     */
    default void listInventoriesByProduct(com.trizo1104.wms.proto.ListInventoriesByProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInventoriesByProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WmsService.
   */
  public static abstract class WmsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WmsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WmsService.
   */
  public static final class WmsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WmsServiceStub> {
    private WmsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WmsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(com.trizo1104.wms.proto.CreateProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(com.trizo1104.wms.proto.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductBySku(com.trizo1104.wms.proto.GetProductBySkuRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductBySkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.trizo1104.wms.proto.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.trizo1104.wms.proto.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProducts(com.trizo1104.wms.proto.ListProductsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWarehouse(com.trizo1104.wms.proto.CreateWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWarehouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWarehouseById(com.trizo1104.wms.proto.GetWarehouseByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWarehouseByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWarehouseByCode(com.trizo1104.wms.proto.GetWarehouseByCodeRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWarehouseByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWarehouse(com.trizo1104.wms.proto.UpdateWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWarehouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWarehouse(com.trizo1104.wms.proto.DeleteWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteWarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWarehouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWarehouses(com.trizo1104.wms.proto.ListWarehousesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListWarehousesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWarehousesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInventory(com.trizo1104.wms.proto.GetInventoryRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.InventoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInventories(com.trizo1104.wms.proto.ListInventoriesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInventoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInventoriesByWarehouse(com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInventoriesByWarehouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInventoriesByProduct(com.trizo1104.wms.proto.ListInventoriesByProductRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInventoriesByProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WmsService.
   */
  public static final class WmsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WmsServiceBlockingStub> {
    private WmsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WmsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trizo1104.wms.proto.ProductResponse createProduct(com.trizo1104.wms.proto.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ProductResponse getProductById(com.trizo1104.wms.proto.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ProductResponse getProductBySku(com.trizo1104.wms.proto.GetProductBySkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductBySkuMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ProductResponse updateProduct(com.trizo1104.wms.proto.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.DeleteProductResponse deleteProduct(com.trizo1104.wms.proto.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ListProductsResponse listProducts(com.trizo1104.wms.proto.ListProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.WarehouseResponse createWarehouse(com.trizo1104.wms.proto.CreateWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWarehouseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.WarehouseResponse getWarehouseById(com.trizo1104.wms.proto.GetWarehouseByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWarehouseByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.WarehouseResponse getWarehouseByCode(com.trizo1104.wms.proto.GetWarehouseByCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWarehouseByCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.WarehouseResponse updateWarehouse(com.trizo1104.wms.proto.UpdateWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWarehouseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.DeleteWarehouseResponse deleteWarehouse(com.trizo1104.wms.proto.DeleteWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWarehouseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ListWarehousesResponse listWarehouses(com.trizo1104.wms.proto.ListWarehousesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWarehousesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.InventoryResponse getInventory(com.trizo1104.wms.proto.GetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInventoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ListInventoriesResponse listInventories(com.trizo1104.wms.proto.ListInventoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInventoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ListInventoriesResponse listInventoriesByWarehouse(com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInventoriesByWarehouseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.wms.proto.ListInventoriesResponse listInventoriesByProduct(com.trizo1104.wms.proto.ListInventoriesByProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInventoriesByProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WmsService.
   */
  public static final class WmsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WmsServiceFutureStub> {
    private WmsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WmsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WmsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ProductResponse> createProduct(
        com.trizo1104.wms.proto.CreateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ProductResponse> getProductById(
        com.trizo1104.wms.proto.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ProductResponse> getProductBySku(
        com.trizo1104.wms.proto.GetProductBySkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductBySkuMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ProductResponse> updateProduct(
        com.trizo1104.wms.proto.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.DeleteProductResponse> deleteProduct(
        com.trizo1104.wms.proto.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ListProductsResponse> listProducts(
        com.trizo1104.wms.proto.ListProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.WarehouseResponse> createWarehouse(
        com.trizo1104.wms.proto.CreateWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWarehouseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.WarehouseResponse> getWarehouseById(
        com.trizo1104.wms.proto.GetWarehouseByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWarehouseByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.WarehouseResponse> getWarehouseByCode(
        com.trizo1104.wms.proto.GetWarehouseByCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWarehouseByCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.WarehouseResponse> updateWarehouse(
        com.trizo1104.wms.proto.UpdateWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWarehouseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.DeleteWarehouseResponse> deleteWarehouse(
        com.trizo1104.wms.proto.DeleteWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWarehouseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ListWarehousesResponse> listWarehouses(
        com.trizo1104.wms.proto.ListWarehousesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWarehousesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.InventoryResponse> getInventory(
        com.trizo1104.wms.proto.GetInventoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ListInventoriesResponse> listInventories(
        com.trizo1104.wms.proto.ListInventoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInventoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ListInventoriesResponse> listInventoriesByWarehouse(
        com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInventoriesByWarehouseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.wms.proto.ListInventoriesResponse> listInventoriesByProduct(
        com.trizo1104.wms.proto.ListInventoriesByProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInventoriesByProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_GET_PRODUCT_BY_SKU = 2;
  private static final int METHODID_UPDATE_PRODUCT = 3;
  private static final int METHODID_DELETE_PRODUCT = 4;
  private static final int METHODID_LIST_PRODUCTS = 5;
  private static final int METHODID_CREATE_WAREHOUSE = 6;
  private static final int METHODID_GET_WAREHOUSE_BY_ID = 7;
  private static final int METHODID_GET_WAREHOUSE_BY_CODE = 8;
  private static final int METHODID_UPDATE_WAREHOUSE = 9;
  private static final int METHODID_DELETE_WAREHOUSE = 10;
  private static final int METHODID_LIST_WAREHOUSES = 11;
  private static final int METHODID_GET_INVENTORY = 12;
  private static final int METHODID_LIST_INVENTORIES = 13;
  private static final int METHODID_LIST_INVENTORIES_BY_WAREHOUSE = 14;
  private static final int METHODID_LIST_INVENTORIES_BY_PRODUCT = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.trizo1104.wms.proto.CreateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((com.trizo1104.wms.proto.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_SKU:
          serviceImpl.getProductBySku((com.trizo1104.wms.proto.GetProductBySkuRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.trizo1104.wms.proto.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.trizo1104.wms.proto.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteProductResponse>) responseObserver);
          break;
        case METHODID_LIST_PRODUCTS:
          serviceImpl.listProducts((com.trizo1104.wms.proto.ListProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListProductsResponse>) responseObserver);
          break;
        case METHODID_CREATE_WAREHOUSE:
          serviceImpl.createWarehouse((com.trizo1104.wms.proto.CreateWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse>) responseObserver);
          break;
        case METHODID_GET_WAREHOUSE_BY_ID:
          serviceImpl.getWarehouseById((com.trizo1104.wms.proto.GetWarehouseByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse>) responseObserver);
          break;
        case METHODID_GET_WAREHOUSE_BY_CODE:
          serviceImpl.getWarehouseByCode((com.trizo1104.wms.proto.GetWarehouseByCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WAREHOUSE:
          serviceImpl.updateWarehouse((com.trizo1104.wms.proto.UpdateWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.WarehouseResponse>) responseObserver);
          break;
        case METHODID_DELETE_WAREHOUSE:
          serviceImpl.deleteWarehouse((com.trizo1104.wms.proto.DeleteWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.DeleteWarehouseResponse>) responseObserver);
          break;
        case METHODID_LIST_WAREHOUSES:
          serviceImpl.listWarehouses((com.trizo1104.wms.proto.ListWarehousesRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListWarehousesResponse>) responseObserver);
          break;
        case METHODID_GET_INVENTORY:
          serviceImpl.getInventory((com.trizo1104.wms.proto.GetInventoryRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.InventoryResponse>) responseObserver);
          break;
        case METHODID_LIST_INVENTORIES:
          serviceImpl.listInventories((com.trizo1104.wms.proto.ListInventoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_INVENTORIES_BY_WAREHOUSE:
          serviceImpl.listInventoriesByWarehouse((com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse>) responseObserver);
          break;
        case METHODID_LIST_INVENTORIES_BY_PRODUCT:
          serviceImpl.listInventoriesByProduct((com.trizo1104.wms.proto.ListInventoriesByProductRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.wms.proto.ListInventoriesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.CreateProductRequest,
              com.trizo1104.wms.proto.ProductResponse>(
                service, METHODID_CREATE_PRODUCT)))
        .addMethod(
          getGetProductByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.GetProductByIdRequest,
              com.trizo1104.wms.proto.ProductResponse>(
                service, METHODID_GET_PRODUCT_BY_ID)))
        .addMethod(
          getGetProductBySkuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.GetProductBySkuRequest,
              com.trizo1104.wms.proto.ProductResponse>(
                service, METHODID_GET_PRODUCT_BY_SKU)))
        .addMethod(
          getUpdateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.UpdateProductRequest,
              com.trizo1104.wms.proto.ProductResponse>(
                service, METHODID_UPDATE_PRODUCT)))
        .addMethod(
          getDeleteProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.DeleteProductRequest,
              com.trizo1104.wms.proto.DeleteProductResponse>(
                service, METHODID_DELETE_PRODUCT)))
        .addMethod(
          getListProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.ListProductsRequest,
              com.trizo1104.wms.proto.ListProductsResponse>(
                service, METHODID_LIST_PRODUCTS)))
        .addMethod(
          getCreateWarehouseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.CreateWarehouseRequest,
              com.trizo1104.wms.proto.WarehouseResponse>(
                service, METHODID_CREATE_WAREHOUSE)))
        .addMethod(
          getGetWarehouseByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.GetWarehouseByIdRequest,
              com.trizo1104.wms.proto.WarehouseResponse>(
                service, METHODID_GET_WAREHOUSE_BY_ID)))
        .addMethod(
          getGetWarehouseByCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.GetWarehouseByCodeRequest,
              com.trizo1104.wms.proto.WarehouseResponse>(
                service, METHODID_GET_WAREHOUSE_BY_CODE)))
        .addMethod(
          getUpdateWarehouseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.UpdateWarehouseRequest,
              com.trizo1104.wms.proto.WarehouseResponse>(
                service, METHODID_UPDATE_WAREHOUSE)))
        .addMethod(
          getDeleteWarehouseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.DeleteWarehouseRequest,
              com.trizo1104.wms.proto.DeleteWarehouseResponse>(
                service, METHODID_DELETE_WAREHOUSE)))
        .addMethod(
          getListWarehousesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.ListWarehousesRequest,
              com.trizo1104.wms.proto.ListWarehousesResponse>(
                service, METHODID_LIST_WAREHOUSES)))
        .addMethod(
          getGetInventoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.GetInventoryRequest,
              com.trizo1104.wms.proto.InventoryResponse>(
                service, METHODID_GET_INVENTORY)))
        .addMethod(
          getListInventoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.ListInventoriesRequest,
              com.trizo1104.wms.proto.ListInventoriesResponse>(
                service, METHODID_LIST_INVENTORIES)))
        .addMethod(
          getListInventoriesByWarehouseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.ListInventoriesByWarehouseRequest,
              com.trizo1104.wms.proto.ListInventoriesResponse>(
                service, METHODID_LIST_INVENTORIES_BY_WAREHOUSE)))
        .addMethod(
          getListInventoriesByProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.wms.proto.ListInventoriesByProductRequest,
              com.trizo1104.wms.proto.ListInventoriesResponse>(
                service, METHODID_LIST_INVENTORIES_BY_PRODUCT)))
        .build();
  }

  private static abstract class WmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trizo1104.wms.proto.WmsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WmsService");
    }
  }

  private static final class WmsServiceFileDescriptorSupplier
      extends WmsServiceBaseDescriptorSupplier {
    WmsServiceFileDescriptorSupplier() {}
  }

  private static final class WmsServiceMethodDescriptorSupplier
      extends WmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WmsServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WmsServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getGetProductBySkuMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .addMethod(getListProductsMethod())
              .addMethod(getCreateWarehouseMethod())
              .addMethod(getGetWarehouseByIdMethod())
              .addMethod(getGetWarehouseByCodeMethod())
              .addMethod(getUpdateWarehouseMethod())
              .addMethod(getDeleteWarehouseMethod())
              .addMethod(getListWarehousesMethod())
              .addMethod(getGetInventoryMethod())
              .addMethod(getListInventoriesMethod())
              .addMethod(getListInventoriesByWarehouseMethod())
              .addMethod(getListInventoriesByProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
