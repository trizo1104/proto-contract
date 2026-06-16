package com.trizo1104.auth.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: auth/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "auth.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.LoginRequest,
      com.trizo1104.auth.proto.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.trizo1104.auth.proto.LoginRequest.class,
      responseType = com.trizo1104.auth.proto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.LoginRequest,
      com.trizo1104.auth.proto.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.LoginRequest, com.trizo1104.auth.proto.LoginResponse> getLoginMethod;
    if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
          AuthServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.LoginRequest, com.trizo1104.auth.proto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.MeRequest,
      com.trizo1104.auth.proto.MeResponse> getMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Me",
      requestType = com.trizo1104.auth.proto.MeRequest.class,
      responseType = com.trizo1104.auth.proto.MeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.MeRequest,
      com.trizo1104.auth.proto.MeResponse> getMeMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.MeRequest, com.trizo1104.auth.proto.MeResponse> getMeMethod;
    if ((getMeMethod = AuthServiceGrpc.getMeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getMeMethod = AuthServiceGrpc.getMeMethod) == null) {
          AuthServiceGrpc.getMeMethod = getMeMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.MeRequest, com.trizo1104.auth.proto.MeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Me"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.MeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.MeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Me"))
              .build();
        }
      }
    }
    return getMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateUserRequest,
      com.trizo1104.auth.proto.UserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.trizo1104.auth.proto.CreateUserRequest.class,
      responseType = com.trizo1104.auth.proto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateUserRequest,
      com.trizo1104.auth.proto.UserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateUserRequest, com.trizo1104.auth.proto.UserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = AuthServiceGrpc.getCreateUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getCreateUserMethod = AuthServiceGrpc.getCreateUserMethod) == null) {
          AuthServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.CreateUserRequest, com.trizo1104.auth.proto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserByIdRequest,
      com.trizo1104.auth.proto.UserResponse> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = com.trizo1104.auth.proto.GetUserByIdRequest.class,
      responseType = com.trizo1104.auth.proto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserByIdRequest,
      com.trizo1104.auth.proto.UserResponse> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserByIdRequest, com.trizo1104.auth.proto.UserResponse> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = AuthServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetUserByIdMethod = AuthServiceGrpc.getGetUserByIdMethod) == null) {
          AuthServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.GetUserByIdRequest, com.trizo1104.auth.proto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.GetUserByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateUserRequest,
      com.trizo1104.auth.proto.UserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.trizo1104.auth.proto.UpdateUserRequest.class,
      responseType = com.trizo1104.auth.proto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateUserRequest,
      com.trizo1104.auth.proto.UserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateUserRequest, com.trizo1104.auth.proto.UserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = AuthServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateUserMethod = AuthServiceGrpc.getUpdateUserMethod) == null) {
          AuthServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.UpdateUserRequest, com.trizo1104.auth.proto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteUserRequest,
      com.trizo1104.auth.proto.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.trizo1104.auth.proto.DeleteUserRequest.class,
      responseType = com.trizo1104.auth.proto.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteUserRequest,
      com.trizo1104.auth.proto.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteUserRequest, com.trizo1104.auth.proto.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = AuthServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteUserMethod = AuthServiceGrpc.getDeleteUserMethod) == null) {
          AuthServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.DeleteUserRequest, com.trizo1104.auth.proto.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListUsersRequest,
      com.trizo1104.auth.proto.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.trizo1104.auth.proto.ListUsersRequest.class,
      responseType = com.trizo1104.auth.proto.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListUsersRequest,
      com.trizo1104.auth.proto.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListUsersRequest, com.trizo1104.auth.proto.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = AuthServiceGrpc.getListUsersMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListUsersMethod = AuthServiceGrpc.getListUsersMethod) == null) {
          AuthServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.ListUsersRequest, com.trizo1104.auth.proto.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListRolesRequest,
      com.trizo1104.auth.proto.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = com.trizo1104.auth.proto.ListRolesRequest.class,
      responseType = com.trizo1104.auth.proto.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListRolesRequest,
      com.trizo1104.auth.proto.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListRolesRequest, com.trizo1104.auth.proto.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = AuthServiceGrpc.getListRolesMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListRolesMethod = AuthServiceGrpc.getListRolesMethod) == null) {
          AuthServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.ListRolesRequest, com.trizo1104.auth.proto.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListRoles"))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getCreateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRole",
      requestType = com.trizo1104.auth.proto.CreateRoleRequest.class,
      responseType = com.trizo1104.auth.proto.RoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.CreateRoleRequest, com.trizo1104.auth.proto.RoleResponse> getCreateRoleMethod;
    if ((getCreateRoleMethod = AuthServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getCreateRoleMethod = AuthServiceGrpc.getCreateRoleMethod) == null) {
          AuthServiceGrpc.getCreateRoleMethod = getCreateRoleMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.CreateRoleRequest, com.trizo1104.auth.proto.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.CreateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("CreateRole"))
              .build();
        }
      }
    }
    return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteRoleRequest,
      com.trizo1104.auth.proto.DeleteRoleResponse> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = com.trizo1104.auth.proto.DeleteRoleRequest.class,
      responseType = com.trizo1104.auth.proto.DeleteRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteRoleRequest,
      com.trizo1104.auth.proto.DeleteRoleResponse> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.DeleteRoleRequest, com.trizo1104.auth.proto.DeleteRoleResponse> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = AuthServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDeleteRoleMethod = AuthServiceGrpc.getDeleteRoleMethod) == null) {
          AuthServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.DeleteRoleRequest, com.trizo1104.auth.proto.DeleteRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.DeleteRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("DeleteRole"))
              .build();
        }
      }
    }
    return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignRoleToUserRequest,
      com.trizo1104.auth.proto.AssignRoleToUserResponse> getAssignRoleToUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoleToUser",
      requestType = com.trizo1104.auth.proto.AssignRoleToUserRequest.class,
      responseType = com.trizo1104.auth.proto.AssignRoleToUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignRoleToUserRequest,
      com.trizo1104.auth.proto.AssignRoleToUserResponse> getAssignRoleToUserMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignRoleToUserRequest, com.trizo1104.auth.proto.AssignRoleToUserResponse> getAssignRoleToUserMethod;
    if ((getAssignRoleToUserMethod = AuthServiceGrpc.getAssignRoleToUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAssignRoleToUserMethod = AuthServiceGrpc.getAssignRoleToUserMethod) == null) {
          AuthServiceGrpc.getAssignRoleToUserMethod = getAssignRoleToUserMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.AssignRoleToUserRequest, com.trizo1104.auth.proto.AssignRoleToUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRoleToUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.AssignRoleToUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.AssignRoleToUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AssignRoleToUser"))
              .build();
        }
      }
    }
    return getAssignRoleToUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemoveRoleFromUserRequest,
      com.trizo1104.auth.proto.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoleFromUser",
      requestType = com.trizo1104.auth.proto.RemoveRoleFromUserRequest.class,
      responseType = com.trizo1104.auth.proto.RemoveRoleFromUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemoveRoleFromUserRequest,
      com.trizo1104.auth.proto.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemoveRoleFromUserRequest, com.trizo1104.auth.proto.RemoveRoleFromUserResponse> getRemoveRoleFromUserMethod;
    if ((getRemoveRoleFromUserMethod = AuthServiceGrpc.getRemoveRoleFromUserMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRemoveRoleFromUserMethod = AuthServiceGrpc.getRemoveRoleFromUserMethod) == null) {
          AuthServiceGrpc.getRemoveRoleFromUserMethod = getRemoveRoleFromUserMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.RemoveRoleFromUserRequest, com.trizo1104.auth.proto.RemoveRoleFromUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRoleFromUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RemoveRoleFromUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RemoveRoleFromUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("RemoveRoleFromUser"))
              .build();
        }
      }
    }
    return getRemoveRoleFromUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignPermissionToRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getAssignPermissionToRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignPermissionToRole",
      requestType = com.trizo1104.auth.proto.AssignPermissionToRoleRequest.class,
      responseType = com.trizo1104.auth.proto.RoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignPermissionToRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getAssignPermissionToRoleMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.AssignPermissionToRoleRequest, com.trizo1104.auth.proto.RoleResponse> getAssignPermissionToRoleMethod;
    if ((getAssignPermissionToRoleMethod = AuthServiceGrpc.getAssignPermissionToRoleMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getAssignPermissionToRoleMethod = AuthServiceGrpc.getAssignPermissionToRoleMethod) == null) {
          AuthServiceGrpc.getAssignPermissionToRoleMethod = getAssignPermissionToRoleMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.AssignPermissionToRoleRequest, com.trizo1104.auth.proto.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignPermissionToRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.AssignPermissionToRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("AssignPermissionToRole"))
              .build();
        }
      }
    }
    return getAssignPermissionToRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemovePermissionFromRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getRemovePermissionFromRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePermissionFromRole",
      requestType = com.trizo1104.auth.proto.RemovePermissionFromRoleRequest.class,
      responseType = com.trizo1104.auth.proto.RoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemovePermissionFromRoleRequest,
      com.trizo1104.auth.proto.RoleResponse> getRemovePermissionFromRoleMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.RemovePermissionFromRoleRequest, com.trizo1104.auth.proto.RoleResponse> getRemovePermissionFromRoleMethod;
    if ((getRemovePermissionFromRoleMethod = AuthServiceGrpc.getRemovePermissionFromRoleMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRemovePermissionFromRoleMethod = AuthServiceGrpc.getRemovePermissionFromRoleMethod) == null) {
          AuthServiceGrpc.getRemovePermissionFromRoleMethod = getRemovePermissionFromRoleMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.RemovePermissionFromRoleRequest, com.trizo1104.auth.proto.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePermissionFromRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RemovePermissionFromRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("RemovePermissionFromRole"))
              .build();
        }
      }
    }
    return getRemovePermissionFromRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateRolePermissionsRequest,
      com.trizo1104.auth.proto.RoleResponse> getUpdateRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRolePermissions",
      requestType = com.trizo1104.auth.proto.UpdateRolePermissionsRequest.class,
      responseType = com.trizo1104.auth.proto.RoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateRolePermissionsRequest,
      com.trizo1104.auth.proto.RoleResponse> getUpdateRolePermissionsMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.UpdateRolePermissionsRequest, com.trizo1104.auth.proto.RoleResponse> getUpdateRolePermissionsMethod;
    if ((getUpdateRolePermissionsMethod = AuthServiceGrpc.getUpdateRolePermissionsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getUpdateRolePermissionsMethod = AuthServiceGrpc.getUpdateRolePermissionsMethod) == null) {
          AuthServiceGrpc.getUpdateRolePermissionsMethod = getUpdateRolePermissionsMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.UpdateRolePermissionsRequest, com.trizo1104.auth.proto.RoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.UpdateRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.RoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("UpdateRolePermissions"))
              .build();
        }
      }
    }
    return getUpdateRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetRolePermissionsRequest,
      com.trizo1104.auth.proto.PermissionListResponse> getGetRolePermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRolePermissions",
      requestType = com.trizo1104.auth.proto.GetRolePermissionsRequest.class,
      responseType = com.trizo1104.auth.proto.PermissionListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetRolePermissionsRequest,
      com.trizo1104.auth.proto.PermissionListResponse> getGetRolePermissionsMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetRolePermissionsRequest, com.trizo1104.auth.proto.PermissionListResponse> getGetRolePermissionsMethod;
    if ((getGetRolePermissionsMethod = AuthServiceGrpc.getGetRolePermissionsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetRolePermissionsMethod = AuthServiceGrpc.getGetRolePermissionsMethod) == null) {
          AuthServiceGrpc.getGetRolePermissionsMethod = getGetRolePermissionsMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.GetRolePermissionsRequest, com.trizo1104.auth.proto.PermissionListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.GetRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.PermissionListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetRolePermissions"))
              .build();
        }
      }
    }
    return getGetRolePermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListPermissionsRequest,
      com.trizo1104.auth.proto.ListPermissionsResponse> getListPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPermissions",
      requestType = com.trizo1104.auth.proto.ListPermissionsRequest.class,
      responseType = com.trizo1104.auth.proto.ListPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListPermissionsRequest,
      com.trizo1104.auth.proto.ListPermissionsResponse> getListPermissionsMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.ListPermissionsRequest, com.trizo1104.auth.proto.ListPermissionsResponse> getListPermissionsMethod;
    if ((getListPermissionsMethod = AuthServiceGrpc.getListPermissionsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getListPermissionsMethod = AuthServiceGrpc.getListPermissionsMethod) == null) {
          AuthServiceGrpc.getListPermissionsMethod = getListPermissionsMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.ListPermissionsRequest, com.trizo1104.auth.proto.ListPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.ListPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ListPermissions"))
              .build();
        }
      }
    }
    return getListPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserPermissionsRequest,
      com.trizo1104.auth.proto.GetUserPermissionsResponse> getGetUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPermissions",
      requestType = com.trizo1104.auth.proto.GetUserPermissionsRequest.class,
      responseType = com.trizo1104.auth.proto.GetUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserPermissionsRequest,
      com.trizo1104.auth.proto.GetUserPermissionsResponse> getGetUserPermissionsMethod() {
    io.grpc.MethodDescriptor<com.trizo1104.auth.proto.GetUserPermissionsRequest, com.trizo1104.auth.proto.GetUserPermissionsResponse> getGetUserPermissionsMethod;
    if ((getGetUserPermissionsMethod = AuthServiceGrpc.getGetUserPermissionsMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetUserPermissionsMethod = AuthServiceGrpc.getGetUserPermissionsMethod) == null) {
          AuthServiceGrpc.getGetUserPermissionsMethod = getGetUserPermissionsMethod =
              io.grpc.MethodDescriptor.<com.trizo1104.auth.proto.GetUserPermissionsRequest, com.trizo1104.auth.proto.GetUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.GetUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.trizo1104.auth.proto.GetUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("GetUserPermissions"))
              .build();
        }
      }
    }
    return getGetUserPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void login(com.trizo1104.auth.proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void me(com.trizo1104.auth.proto.MeRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.MeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMeMethod(), responseObserver);
    }

    /**
     */
    default void createUser(com.trizo1104.auth.proto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void getUserById(com.trizo1104.auth.proto.GetUserByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(com.trizo1104.auth.proto.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.trizo1104.auth.proto.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    default void listUsers(com.trizo1104.auth.proto.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    default void listRoles(com.trizo1104.auth.proto.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    default void createRole(com.trizo1104.auth.proto.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    default void deleteRole(com.trizo1104.auth.proto.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    default void assignRoleToUser(com.trizo1104.auth.proto.AssignRoleToUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.AssignRoleToUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRoleToUserMethod(), responseObserver);
    }

    /**
     */
    default void removeRoleFromUser(com.trizo1104.auth.proto.RemoveRoleFromUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RemoveRoleFromUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleFromUserMethod(), responseObserver);
    }

    /**
     */
    default void assignPermissionToRole(com.trizo1104.auth.proto.AssignPermissionToRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignPermissionToRoleMethod(), responseObserver);
    }

    /**
     */
    default void removePermissionFromRole(com.trizo1104.auth.proto.RemovePermissionFromRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePermissionFromRoleMethod(), responseObserver);
    }

    /**
     */
    default void updateRolePermissions(com.trizo1104.auth.proto.UpdateRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRolePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void getRolePermissions(com.trizo1104.auth.proto.GetRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.PermissionListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRolePermissionsMethod(), responseObserver);
    }

    /**
     */
    default void listPermissions(com.trizo1104.auth.proto.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void getUserPermissions(com.trizo1104.auth.proto.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.GetUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPermissionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(com.trizo1104.auth.proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void me(com.trizo1104.auth.proto.MeRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.MeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.trizo1104.auth.proto.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(com.trizo1104.auth.proto.GetUserByIdRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.trizo1104.auth.proto.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.trizo1104.auth.proto.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(com.trizo1104.auth.proto.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoles(com.trizo1104.auth.proto.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRole(com.trizo1104.auth.proto.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(com.trizo1104.auth.proto.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRoleToUser(com.trizo1104.auth.proto.AssignRoleToUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.AssignRoleToUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRoleToUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRoleFromUser(com.trizo1104.auth.proto.RemoveRoleFromUserRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RemoveRoleFromUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleFromUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignPermissionToRole(com.trizo1104.auth.proto.AssignPermissionToRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignPermissionToRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePermissionFromRole(com.trizo1104.auth.proto.RemovePermissionFromRoleRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePermissionFromRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRolePermissions(com.trizo1104.auth.proto.UpdateRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRolePermissions(com.trizo1104.auth.proto.GetRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.PermissionListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPermissions(com.trizo1104.auth.proto.ListPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserPermissions(com.trizo1104.auth.proto.GetUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.GetUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.trizo1104.auth.proto.LoginResponse login(com.trizo1104.auth.proto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.MeResponse me(com.trizo1104.auth.proto.MeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.UserResponse createUser(com.trizo1104.auth.proto.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.UserResponse getUserById(com.trizo1104.auth.proto.GetUserByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.UserResponse updateUser(com.trizo1104.auth.proto.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.DeleteUserResponse deleteUser(com.trizo1104.auth.proto.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.ListUsersResponse listUsers(com.trizo1104.auth.proto.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.ListRolesResponse listRoles(com.trizo1104.auth.proto.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.RoleResponse createRole(com.trizo1104.auth.proto.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.DeleteRoleResponse deleteRole(com.trizo1104.auth.proto.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.AssignRoleToUserResponse assignRoleToUser(com.trizo1104.auth.proto.AssignRoleToUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleToUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.RemoveRoleFromUserResponse removeRoleFromUser(com.trizo1104.auth.proto.RemoveRoleFromUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleFromUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.RoleResponse assignPermissionToRole(com.trizo1104.auth.proto.AssignPermissionToRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignPermissionToRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.RoleResponse removePermissionFromRole(com.trizo1104.auth.proto.RemovePermissionFromRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePermissionFromRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.RoleResponse updateRolePermissions(com.trizo1104.auth.proto.UpdateRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.PermissionListResponse getRolePermissions(com.trizo1104.auth.proto.GetRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRolePermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.ListPermissionsResponse listPermissions(com.trizo1104.auth.proto.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.trizo1104.auth.proto.GetUserPermissionsResponse getUserPermissions(com.trizo1104.auth.proto.GetUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.LoginResponse> login(
        com.trizo1104.auth.proto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.MeResponse> me(
        com.trizo1104.auth.proto.MeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.UserResponse> createUser(
        com.trizo1104.auth.proto.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.UserResponse> getUserById(
        com.trizo1104.auth.proto.GetUserByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.UserResponse> updateUser(
        com.trizo1104.auth.proto.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.DeleteUserResponse> deleteUser(
        com.trizo1104.auth.proto.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.ListUsersResponse> listUsers(
        com.trizo1104.auth.proto.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.ListRolesResponse> listRoles(
        com.trizo1104.auth.proto.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.RoleResponse> createRole(
        com.trizo1104.auth.proto.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.DeleteRoleResponse> deleteRole(
        com.trizo1104.auth.proto.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.AssignRoleToUserResponse> assignRoleToUser(
        com.trizo1104.auth.proto.AssignRoleToUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRoleToUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.RemoveRoleFromUserResponse> removeRoleFromUser(
        com.trizo1104.auth.proto.RemoveRoleFromUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleFromUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.RoleResponse> assignPermissionToRole(
        com.trizo1104.auth.proto.AssignPermissionToRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignPermissionToRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.RoleResponse> removePermissionFromRole(
        com.trizo1104.auth.proto.RemovePermissionFromRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePermissionFromRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.RoleResponse> updateRolePermissions(
        com.trizo1104.auth.proto.UpdateRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.PermissionListResponse> getRolePermissions(
        com.trizo1104.auth.proto.GetRolePermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRolePermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.ListPermissionsResponse> listPermissions(
        com.trizo1104.auth.proto.ListPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.trizo1104.auth.proto.GetUserPermissionsResponse> getUserPermissions(
        com.trizo1104.auth.proto.GetUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_ME = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_GET_USER_BY_ID = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_DELETE_USER = 5;
  private static final int METHODID_LIST_USERS = 6;
  private static final int METHODID_LIST_ROLES = 7;
  private static final int METHODID_CREATE_ROLE = 8;
  private static final int METHODID_DELETE_ROLE = 9;
  private static final int METHODID_ASSIGN_ROLE_TO_USER = 10;
  private static final int METHODID_REMOVE_ROLE_FROM_USER = 11;
  private static final int METHODID_ASSIGN_PERMISSION_TO_ROLE = 12;
  private static final int METHODID_REMOVE_PERMISSION_FROM_ROLE = 13;
  private static final int METHODID_UPDATE_ROLE_PERMISSIONS = 14;
  private static final int METHODID_GET_ROLE_PERMISSIONS = 15;
  private static final int METHODID_LIST_PERMISSIONS = 16;
  private static final int METHODID_GET_USER_PERMISSIONS = 17;

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
        case METHODID_LOGIN:
          serviceImpl.login((com.trizo1104.auth.proto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.LoginResponse>) responseObserver);
          break;
        case METHODID_ME:
          serviceImpl.me((com.trizo1104.auth.proto.MeRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.MeResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.trizo1104.auth.proto.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.trizo1104.auth.proto.GetUserByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.trizo1104.auth.proto.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.trizo1104.auth.proto.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.trizo1104.auth.proto.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((com.trizo1104.auth.proto.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListRolesResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((com.trizo1104.auth.proto.CreateRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((com.trizo1104.auth.proto.DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.DeleteRoleResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE_TO_USER:
          serviceImpl.assignRoleToUser((com.trizo1104.auth.proto.AssignRoleToUserRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.AssignRoleToUserResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE_FROM_USER:
          serviceImpl.removeRoleFromUser((com.trizo1104.auth.proto.RemoveRoleFromUserRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RemoveRoleFromUserResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_PERMISSION_TO_ROLE:
          serviceImpl.assignPermissionToRole((com.trizo1104.auth.proto.AssignPermissionToRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PERMISSION_FROM_ROLE:
          serviceImpl.removePermissionFromRole((com.trizo1104.auth.proto.RemovePermissionFromRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE_PERMISSIONS:
          serviceImpl.updateRolePermissions((com.trizo1104.auth.proto.UpdateRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.RoleResponse>) responseObserver);
          break;
        case METHODID_GET_ROLE_PERMISSIONS:
          serviceImpl.getRolePermissions((com.trizo1104.auth.proto.GetRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.PermissionListResponse>) responseObserver);
          break;
        case METHODID_LIST_PERMISSIONS:
          serviceImpl.listPermissions((com.trizo1104.auth.proto.ListPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.ListPermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PERMISSIONS:
          serviceImpl.getUserPermissions((com.trizo1104.auth.proto.GetUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.trizo1104.auth.proto.GetUserPermissionsResponse>) responseObserver);
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
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.LoginRequest,
              com.trizo1104.auth.proto.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getMeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.MeRequest,
              com.trizo1104.auth.proto.MeResponse>(
                service, METHODID_ME)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.CreateUserRequest,
              com.trizo1104.auth.proto.UserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.GetUserByIdRequest,
              com.trizo1104.auth.proto.UserResponse>(
                service, METHODID_GET_USER_BY_ID)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.UpdateUserRequest,
              com.trizo1104.auth.proto.UserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.DeleteUserRequest,
              com.trizo1104.auth.proto.DeleteUserResponse>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.ListUsersRequest,
              com.trizo1104.auth.proto.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getListRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.ListRolesRequest,
              com.trizo1104.auth.proto.ListRolesResponse>(
                service, METHODID_LIST_ROLES)))
        .addMethod(
          getCreateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.CreateRoleRequest,
              com.trizo1104.auth.proto.RoleResponse>(
                service, METHODID_CREATE_ROLE)))
        .addMethod(
          getDeleteRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.DeleteRoleRequest,
              com.trizo1104.auth.proto.DeleteRoleResponse>(
                service, METHODID_DELETE_ROLE)))
        .addMethod(
          getAssignRoleToUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.AssignRoleToUserRequest,
              com.trizo1104.auth.proto.AssignRoleToUserResponse>(
                service, METHODID_ASSIGN_ROLE_TO_USER)))
        .addMethod(
          getRemoveRoleFromUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.RemoveRoleFromUserRequest,
              com.trizo1104.auth.proto.RemoveRoleFromUserResponse>(
                service, METHODID_REMOVE_ROLE_FROM_USER)))
        .addMethod(
          getAssignPermissionToRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.AssignPermissionToRoleRequest,
              com.trizo1104.auth.proto.RoleResponse>(
                service, METHODID_ASSIGN_PERMISSION_TO_ROLE)))
        .addMethod(
          getRemovePermissionFromRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.RemovePermissionFromRoleRequest,
              com.trizo1104.auth.proto.RoleResponse>(
                service, METHODID_REMOVE_PERMISSION_FROM_ROLE)))
        .addMethod(
          getUpdateRolePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.UpdateRolePermissionsRequest,
              com.trizo1104.auth.proto.RoleResponse>(
                service, METHODID_UPDATE_ROLE_PERMISSIONS)))
        .addMethod(
          getGetRolePermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.GetRolePermissionsRequest,
              com.trizo1104.auth.proto.PermissionListResponse>(
                service, METHODID_GET_ROLE_PERMISSIONS)))
        .addMethod(
          getListPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.ListPermissionsRequest,
              com.trizo1104.auth.proto.ListPermissionsResponse>(
                service, METHODID_LIST_PERMISSIONS)))
        .addMethod(
          getGetUserPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.trizo1104.auth.proto.GetUserPermissionsRequest,
              com.trizo1104.auth.proto.GetUserPermissionsResponse>(
                service, METHODID_GET_USER_PERMISSIONS)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.trizo1104.auth.proto.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getMeMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getCreateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getAssignRoleToUserMethod())
              .addMethod(getRemoveRoleFromUserMethod())
              .addMethod(getAssignPermissionToRoleMethod())
              .addMethod(getRemovePermissionFromRoleMethod())
              .addMethod(getUpdateRolePermissionsMethod())
              .addMethod(getGetRolePermissionsMethod())
              .addMethod(getListPermissionsMethod())
              .addMethod(getGetUserPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
